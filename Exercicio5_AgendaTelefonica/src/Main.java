public class Main {
    public static void main(String[] args) {
        Contato contato1 = new Contato("João", "99999-9999");
        Contato contato2 = new Contato("Maria", "98888-8888");

        System.out.println("=== Testando atualizaçao do telefone do contato1 ===");

        System.out.println(contato1.obterContatoFormatado());
        contato1.atualizarTelefone("97777-7777");
        System.out.println(contato1.obterContatoFormatado());

        System.out.println("\n=== Testando obtençao de contato formatado ===");
        System.out.println(contato2.obterContatoFormatado());
    }
}