public class Main {
    public static void main(String[] args) {
        Reembolso reembolso1 = new Reembolso("Paula", 4);
        Reembolso reembolso2 = new Reembolso("Lucas", 7);
        Reembolso reembolso3 = new Reembolso("Cintia", 10);

        System.out.println("=== Testando cálculo de reembolso com hospedagem ===");

        double total1 = reembolso1.calcularReembolso(150.0, 100.0, 200.0);
        reembolso1.imprimirResumoReembolso(total1);

        System.out.println("\n=== Testando cálculo de reembolso sem hospedagem ===");
        double total2 = reembolso2.calcularReembolso(180.0, 120.0);
        reembolso2.imprimirResumoReembolso(total2);

        System.out.println("\n=== Testando cálculo de reembolso com hospedagem e bonus ===");
        double total3 = reembolso3.calcularReembolso(200.0, 150.0, 300.0);
        reembolso3.imprimirResumoReembolso(total3);

        System.out.println("\n=== Testando cálculo de reembolso com valor inválido ===");
        double total4 = reembolso1.calcularReembolso(-100.0, 50.0);
        reembolso1.imprimirResumoReembolso(total4);
    }
}