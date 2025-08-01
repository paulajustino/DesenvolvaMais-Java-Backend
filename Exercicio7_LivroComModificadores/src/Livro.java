public class Livro {

    public String titulo; // Acesso público
    String autor; // Acesso default (pacote)
    private int paginas; // Acesso privado e restrito a propria classe

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void exibirInformacoes() {
        System.out.printf("Título: %s, Autor: %s, Páginas: %d%n", this.titulo, this.autor, this.paginas);
    }
}
