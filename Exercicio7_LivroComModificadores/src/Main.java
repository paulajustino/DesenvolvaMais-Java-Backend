public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("O Hobbit", "J.R.R. Tolkien", 320);

        System.out.println("=== Teste de acesso direto aos atributos ===");
        System.out.println("Título: " + livro.titulo); // público
        System.out.println("Autor: " + livro.autor);   // default (mesmo pacote)
        //System.out.println("Páginas: " + livro.paginas); // Erro: privado

        System.out.println("\n=== Teste de acesso pelo método ===");
        livro.exibirInformacoes();
    }
}