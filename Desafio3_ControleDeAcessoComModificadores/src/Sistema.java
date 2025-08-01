public class Sistema {
    public static void main(String[] args) {
        Administrador admin = new Administrador("Paula", "paula@email.com", "admin1234");

        System.out.println("=== Teste de acesso aos atributos ===");

        System.out.println(admin.nome); // Acessível para todos (public)
        System.out.println(admin.email); // Acessivel dentro do pacote e para subclasses (protected)
        //System.out.println(admin.senha); // Acessivel apenas dentro da classe (private)
        admin.exibirUsuario();

        System.out.println("\n=== Teste de autenticaçao da senha ===");

        // Caso 1: Senha correta
        System.out.println("Autenticação: " + admin.autenticar("admin1234"));

        // Caso 2: Senha incorreta
        System.out.println("Autenticação: " + admin.autenticar("123"));

        // Caso 3: Senha nula
        System.out.println("Autenticação: " + admin.autenticar(null));

        System.out.println("\n=== Teste de redefinição de senha ===");

        // Caso 4: Nova senha é nula
        admin.redefinirSenha(null);

        // Caso 5: Nova senha é vazia
        admin.redefinirSenha("");

        // Caso 6: Nova senha é igual a atual
        admin.redefinirSenha("admin1234");

        // Caso 7: Nova senha nao é senha forte
        admin.redefinirSenha("abc");

        // Caso 8: Nova senha válida
        admin.redefinirSenha("admin12345");

        System.out.println("\n=== Teste de validaçao de senha forte ===");

        // Caso 9: Senha fraca
        System.out.println(SegurancaUtils.validarSenhaForte("admin123"));

        // Caso 10: Senha forte
        System.out.println(SegurancaUtils.validarSenhaForte("admin12345"));
    }
}