public class Administrador extends Usuario {

    public Administrador(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    @Override
    public boolean autenticar(String senha) {
        return getSenha() != null && getSenha().equals(senha);
    }

    public void redefinirSenha(String novaSenha) {
        if (novaSenha == null || novaSenha.isEmpty()) {
            System.out.println("Erro: A nova senha não pode ser nula ou vazia.");
            return;
        }

        if (novaSenha.equals(getSenha())) {
            System.out.println("Erro: A nova senha não pode ser igual à senha atual.");
            return;
        }

        if (!SegurancaUtils.validarSenhaForte(novaSenha)) {
            System.out.println("Erro: A nova senha não segue as diretrizes de senha forte.");
            return;
        }

        setSenha(novaSenha);
        System.out.println("Senha redefinida com sucesso!");
    }
}
