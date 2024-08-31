package LIVRO;

public class Livro {
	private String nome;
    private String autor;
    private int numPaginas;

    public Livro(String nome, String autor, int numPaginas) {
        this.nome = nome;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "Nome='" + nome + '\'' +
                ", Autor='" + autor + '\'' +
                ", Número de Páginas=" + numPaginas +
                '}';
    }

}



