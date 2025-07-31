public class Contato {

    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    /**
     * Atualiza o número de telefone do contato.
     *
     * @param novoTelefone Novo número de telefone.
     */
    public void atualizarTelefone(String novoTelefone) {
        if (novoTelefone == null || novoTelefone.isEmpty()) {
            System.out.println("Telefone inválido. Nenhuma alteração realizada.");
            return;
        }

        this.telefone = novoTelefone;
        System.out.println("Telefone atualizado com sucesso para: " + this.telefone);
    }

    /**
     * Imprime o contato no formato "Nome: X - Telefone: Y".
     *
     * @return String formatada com nome e telefone.
     */
    public String obterContatoFormatado() {
        return String.format("Nome: %s - Telefone: %s", this.nome, this.telefone);
    }
}
