public abstract class Usuario {

    public String nome; // qualquer classe tem acesso
    protected String email; // classes do mesmo pacote e subclasses tem acesso
    private String senha; // apenas a classe tem acesso

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public abstract boolean autenticar(String senha);

    public final void exibirUsuario() {
        System.out.println("Nome: " + this.nome + ", Email: " + this.email);
    }

    protected String getSenha() {
        return this.senha;
    }

    protected void setSenha(String senha) {
        this.senha = senha;
    }
}
