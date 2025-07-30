public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public Produto(String nome, double preco) {
        this(nome, preco, 0);
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para adicionar no estoque.");
        } else {
            this.estoque += quantidade;
            System.out.printf("Adicionado %d unidades no estoque. Estoque atual: %d%n", quantidade, this.estoque);
        }
    }

    public void vender(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para venda.");
        } else {
            if (this.estoque >= quantidade) {
                this.estoque -= quantidade;
                System.out.printf("Vendendo %d unidades. Estoque atual: %d%n", quantidade, this.estoque);
            } else {
                System.out.println("Estoque insuficiente para a venda.");
            }

        }
    }

    public void exibirResumo() {
        System.out.printf("Produto: %s | Preço: R$ %.2f | Estoque: %d%n", this.nome, this.preco, this.estoque);
    }
}