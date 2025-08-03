import java.util.ArrayList;
import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Conta> contas = criarContasTeste();

        System.out.println("Bem-vinde ao sistema bancário!");

        Conta contaLogada = BancoUtils.autenticarConta(contas, scanner);

        if (contaLogada != null) {
            System.out.printf("Olá, %s! Seu saldo atual é de R$ %.2f.%n",
                    contaLogada.getTitular(), contaLogada.getSaldo());

            Menu menu = new Menu(scanner);
            menu.exibirMenuOperacoes(contaLogada, contas);
        }

        scanner.close();
    }

    private static ArrayList<Conta> criarContasTeste() {
        ArrayList<Conta> contas = new ArrayList<>();
        contas.add(new Conta("Paula", 123, 1000.0));
        contas.add(new Conta("João", 456, 500.0));
        contas.add(new Conta("Maria", 789, 1500.0));

        return contas;
    }
}