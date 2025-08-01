public class Main {
    public static void main(String[] args) {
        Analista analista = new Analista("Paula");

        System.out.println("Salário: R$ " + analista.calcularSalario());
    }
}