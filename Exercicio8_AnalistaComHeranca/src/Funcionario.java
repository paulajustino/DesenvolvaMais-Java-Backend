public abstract class Funcionario {

    protected String nome;
    protected static final double BONUS_BASE = 1000.0;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public abstract double calcularSalario();
}
