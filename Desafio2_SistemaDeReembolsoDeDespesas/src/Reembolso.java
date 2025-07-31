public class Reembolso {

    private String nomeFuncionario;
    private int diasTrabalhados;

    public Reembolso(String nomeFuncionario, int diasTrabalhados) {
        this.nomeFuncionario = nomeFuncionario;
        this.diasTrabalhados = diasTrabalhados;
    }

    /**
     * Calcula o reembolso incluindo alimentação, transporte e hospedagem.
     *
     * @param alimentacao Valor gasto com alimentação.
     * @param transporte Valor gasto com transporte.
     * @param hospedagem Valor gasto com hospedagem.
     * @return Total do reembolso (com bônus se aplicável).
     */
    public double calcularReembolso(double alimentacao, double transporte, double hospedagem) {
        if (!validarValores(alimentacao, transporte, hospedagem)) {
            System.out.println("Erro: Valor(es) inválido(s) para cálculo de reembolso.");
            return 0.0;
        }

        double total = alimentacao + transporte + hospedagem;
        return aplicarBonus(total);
    }

    /**
     * Calcula o reembolso incluindo apenas alimentação e transporte.
     *
     * @param alimentacao Valor gasto com alimentação.
     * @param transporte Valor gasto com transporte.
     * @return Total do reembolso (com bônus se aplicável).
     */
    public double calcularReembolso(double alimentacao, double transporte) {
        if (!validarValores(alimentacao, transporte)) {
            System.out.println("Erro: Valor(es) inválido(s) para cálculo de reembolso.");
            return 0.0;
        }

        double total = alimentacao + transporte;
        return aplicarBonus(total);
    }

    /**
     * Aplica bônus de 10% se os dias trabalhados forem maiores que 7.
     *
     * @param valor Valor original do reembolso.
     * @return Valor com bônus (se aplicável).
     */
    private double aplicarBonus(double valor) {
        if (diasTrabalhados > 7) {
            valor += valor * 0.10;
        }
        return valor;
    }

    /**
     * Verifica se todos os valores informados são válidos (não negativos).
     *
     * @param valores Lista de valores (alimentação, transporte, hospedagem, etc.) a serem validados.
     * @return true se todos os valores forem >= 0, caso contrário false.
     */
    private boolean validarValores(double... valores) {
        for (double valor : valores) {
            if (valor < 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Imprime um resumo do reembolso do funcionário.
     * @param valorTotal Valor total do reembolso (já com bônus).
     */
    public void imprimirResumoReembolso(double valorTotal) {
        System.out.printf("Funcionário: %s – Dias Trabalhados: %d – Reembolso Total: R$ %.2f%n",
                this.nomeFuncionario, this.diasTrabalhados, valorTotal);
    }
}
