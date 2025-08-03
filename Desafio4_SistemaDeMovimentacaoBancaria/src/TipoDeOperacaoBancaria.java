public enum TipoDeOperacaoBancaria {

    /** Operação de depósito de valores na conta. */
    DEPOSITO("Depósito"),

    /** Operação de saque de valores da conta. */
    SAQUE("Saque"),

    /** Operação de transferência de valores para outra conta. */
    TRANSFERENCIA("Transferência"),

    /** Operação de pagamento de valores da conta. */
    PAGAMENTO("Pagamento");

    /** Descrição textual da operação. */
    private final String descricao;

    /**
     * Construtor do enum que associa uma descrição textual à constante.
     *
     * @param descricao Texto descritivo da operação bancária.
     */
    TipoDeOperacaoBancaria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
