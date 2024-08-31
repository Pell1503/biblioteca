package Cadastro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import LIVRO.Livro;

public class CadastrodeLivros {
    private  List<Livro> livros = new ArrayList<>();

    public void cadastrarLivro() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do livro: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o nome do autor: ");
        String autor = scanner.nextLine();

        System.out.print("Digite o número de páginas: ");
        int numPaginas = scanner.nextInt();
        scanner.nextLine();  
        for (Livro livroExistente : livros) {
            if (livroExistente.getNome().equalsIgnoreCase(nome) && 
                livroExistente.getAutor().equalsIgnoreCase(autor)) {
                System.out.println("Erro: Esse livro já está cadastrado.");
                return;
            }
        }

        Livro livro = new Livro(nome, autor, numPaginas);
        livros.add(livro);

        System.out.println("Livro cadastrado com sucesso!");
    }
    
    public  void buscarLivroPorNome() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do livro: ");
        String nome = scanner.nextLine().trim();

        boolean encontrado = false;
        for (Livro livro : livros) {
            if (livro.getNome().trim().equalsIgnoreCase(nome)) {
                System.out.println(livro);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Livro não encontrado.");
        }
    }
    
    public  void buscarLivroPorAutor() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do autor: ");
        String autor = scanner.nextLine().trim();

        boolean encontrado = false;
        for (Livro livro : livros) {
            if (livro.getAutor().trim().equalsIgnoreCase(autor)) {
                System.out.println(livro);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Livro não encontrado.");
        }
    }
    public  void buscarLivroPorNumPaginas() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de páginas: ");
        int numPaginas = scanner.nextInt();
        scanner.nextLine(); 

        boolean encontrado = false;
        for (Livro livro : livros) {
            if (livro.getNumPaginas() == numPaginas) {
                System.out.println(livro);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Livro não encontrado.");
        }
    }

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu de Cadastro de Livros");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Buscar Livro por Nome");
            System.out.println("3. Buscar Livro por Autor");
            System.out.println("4. Buscar Livro por Número de Páginas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastrarLivro();
                    break;
                case 2:
                    buscarLivroPorNome();
                    break;
                case 3:
                    buscarLivroPorAutor();
                    break;
                case 4:
                    buscarLivroPorNumPaginas();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }

}
 


