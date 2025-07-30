//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 3500.0F, 10);
        Produto produto2 = new Produto("Mouse", 150.0F);

        System.out.println("=== Testando operações no Produto 1 ===");

        produto1.exibirResumo();
        produto1.adicionarEstoque(5);
        produto1.adicionarEstoque(0);
        produto1.vender(3);
        produto1.vender(50);
        produto1.vender(0);
        produto1.exibirResumo();

        System.out.println("\n=== Testando operações no Produto 2 ===");

        produto2.exibirResumo();
        produto2.vender(1);
        produto2.adicionarEstoque(10);
        produto2.vender(4);
        produto2.exibirResumo();
    }
}