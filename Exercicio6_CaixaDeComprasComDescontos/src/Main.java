public class Main {
    public static void main(String[] args) {
        CaixaDeCompras caixa = new CaixaDeCompras();

        // Caso 1: Total menor que 100
        double total1 = caixa.calcularTotalComDesconto(20.0, 30.0, 40.0);
        System.out.printf("Caso 1 - Total: R$ %.2f%n", total1);

        // Caso 2: Total igual a 100
        double total2 = caixa.calcularTotalComDesconto(50.0, 25.0, 25.0);
        System.out.printf("Caso 2 - Total: R$ %.2f%n", total2);

        // Caso 3: Total maior que 100
        double total3 = caixa.calcularTotalComDesconto(60.0, 50.0, 30.0);
        System.out.printf("Caso 3 - Total: R$ %.2f%n", total3);

        // Caso 4: Valores inválidos (negativos)
        double total4 = caixa.calcularTotalComDesconto(-10.0, 20.0, 30.0);
        System.out.printf("Caso 4 - Total: R$ %.2f%n", total4);
    }
}