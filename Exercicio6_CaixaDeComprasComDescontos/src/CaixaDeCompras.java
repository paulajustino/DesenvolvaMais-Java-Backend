public class CaixaDeCompras {

    /**
     * Calcula o valor total da compra e aplica desconto caso ultrapasse R$ 100,00.
     *
     * @param valor1 Valor do primeiro item.
     * @param valor2 Valor do segundo item.
     * @param valor3 Valor do terceiro item.
     * @return Valor final da compra, com ou sem desconto.
     */
    public double calcularTotalComDesconto(double valor1, double valor2, double valor3) {
        if (valor1 < 0 || valor2 < 0 || valor3 < 0) {
            System.out.println("Erro: Valor(es) inválido(s).");
            return 0.0;
        }

        double total = valor1 + valor2 + valor3;

        if (total > 100) {
            total = total * 0.9;
        }

        return total;
    }
}
