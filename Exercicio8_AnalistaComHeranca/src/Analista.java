public class Analista extends Funcionario {

    private static final double SALARIO_BASE = 5000.0;

    public Analista(String nome) {
        super(nome);
    }

    @Override
    public double calcularSalario() {
        return SALARIO_BASE + BONUS_BASE;
    }
}
