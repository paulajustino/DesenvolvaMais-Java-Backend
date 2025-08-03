/**
 * Classe que representa uma conta bancária com operações de depósito, saque, transferência e pagamento.
 */
public class Conta {

    private final double TAXA_OPERACAO = 0.5;

    private String titular;
    private final int numero;
    private double saldo;

    /**
     * Construtor para inicializar a conta com titular, número e saldo.
     */
    public Conta(String titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    /**
     * Deposita um valor, descontando a taxa de operação.
     * O valor deve ser positivo e maior que a taxa para ser aceito.
     *
     * @param valor Valor a ser depositado.
     */
    public void depositar(double valor) {
        String operacao = TipoDeOperacaoBancaria.DEPOSITO.getDescricao();
        double valorLiquido = valor - TAXA_OPERACAO;
        if (valor <= 0) {
            exibirMensagemErroValorInvalido(operacao);
        } else if (valor <= TAXA_OPERACAO) {
            exibirMensagemErroValorMenorQueTaxa(operacao);
        } else {
            this.saldo += valorLiquido;
            exibirMensagemSucessoOperacao(operacao, valor);
        }
    }

    /**
     * Saca um valor, descontando a taxa de operação.
     * O valor deve ser positivo e, somado à taxa, não pode ser maior que o saldo disponível.
     *
     * @param valor Valor a ser sacado.
     */
    public void sacar(double valor) {
        String operacao = TipoDeOperacaoBancaria.SAQUE.getDescricao();
        double valorComTaxa = valor + TAXA_OPERACAO;
        if (valor <= 0) {
            exibirMensagemErroValorInvalido(operacao);
        } else if (this.saldo < valorComTaxa) {
            exibirMensagemErroSaldoInsuficiente(operacao);
        } else {
            this.saldo -= valorComTaxa;
            exibirMensagemSucessoOperacao(operacao, valor);
        }
    }

    /**
     * Transfere um valor para outra conta, descontando a taxa de operação.
     * A conta de destino recebe o valor integral (sem taxa).
     *
     * @param contaDestino Conta que receberá a transferência.
     * @param valor Valor a ser transferido.
     */

    public void transferir(Conta contaDestino, double valor) {
        String operacao = TipoDeOperacaoBancaria.TRANSFERENCIA.getDescricao();
        double valorComTaxa = valor + TAXA_OPERACAO;
        if (valor <= 0) {
            exibirMensagemErroValorInvalido(operacao);
        } else if (this.saldo < valorComTaxa) {
            exibirMensagemErroSaldoInsuficiente(operacao);
        } else {
            this.saldo -= valorComTaxa;
            contaDestino.creditar(valor);
            exibirMensagemSucessoOperacao(operacao, valor);
        }
    }

    /**
     * Credita um valor na conta sem aplicar taxa (uso interno para transferências).
     *
     * @param valor Valor a ser creditado.
     */
    private void creditar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    /**
     * Paga um valor, descontando a taxa de operação.
     *
     * @param valor Valor a ser pago.
     */
    public void pagar(double valor) {
        String operacao = TipoDeOperacaoBancaria.PAGAMENTO.getDescricao();
        double valorComTaxa = valor + TAXA_OPERACAO;
        if (valor <= 0) {
            exibirMensagemErroValorInvalido(operacao);
        } else if (this.saldo < valorComTaxa) {
            exibirMensagemErroSaldoInsuficiente(operacao);
        } else {
            this.saldo -= valorComTaxa;
            exibirMensagemSucessoOperacao(operacao, valor);
        }
    }

    /**
     * Exibe mensagem de erro indicando que o valor informado para a operação é inválido.
     *
     * @param tipoOperacao Nome da operação que não pôde ser realizada.
     */
    private void exibirMensagemErroValorInvalido(String tipoOperacao) {
        System.out.printf("Valor inválido para %s.%n", tipoOperacao);
    }

    /**
     * Exibe mensagem de erro indicando que o saldo disponível na conta é insuficiente para a operação.
     *
     * @param tipoOperacao Nome da operação que não pôde ser realizada.
     */
    private void exibirMensagemErroSaldoInsuficiente(String tipoOperacao) {
        System.out.printf("Saldo insuficiente para %s.%n", tipoOperacao);
    }

    /**
     * Exibe mensagem de erro indicando que o valor informado para depósito é menor que a taxa.
     *
     * @param tipoOperacao Nome da operação que não pôde ser realizada.
     */
    private void exibirMensagemErroValorMenorQueTaxa(String tipoOperacao) {
        System.out.printf("Valor do %s precisa ser maior que a taxa de R$ %.2f%n", tipoOperacao, TAXA_OPERACAO);
    }

    /**
     * Exibe mensagem de confirmação informando que a operação foi realizada com sucesso.
     *
     * @param tipoOperacao Nome da operação realizada.
     * @param valor Valor movimentado na operação.
     */

    private void exibirMensagemSucessoOperacao(String tipoOperacao, double valor) {
        System.out.printf("%s de R$ %.2f efetuado(a) com sucesso (taxa: R$ %.2f). Saldo atual: R$ %.2f%n",
                tipoOperacao, valor, TAXA_OPERACAO, this.saldo);
    }

    public String getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
