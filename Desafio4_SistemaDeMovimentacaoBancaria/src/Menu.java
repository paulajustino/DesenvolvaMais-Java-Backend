import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe que exibe menus e lê dados do usuario.
 */
public class Menu {

    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Exibe o menu de operações no console e executa as ações escolhidas pelo usuario na conta logada.
     *
     * @param contaLogada Conta atualmente autenticada.
     * @param contas Lista de contas disponíveis para operações como transferência.
     */
    public void exibirMenuOperacoes(Conta contaLogada, ArrayList<Conta> contas) {
        int opcao;
        do {
            System.out.println("\n===== MENU DE OPERAÇÕES =====");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Transferir");
            System.out.println("4 - Pagar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    contaLogada.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor para saque: ");
                    double valorSaque = scanner.nextDouble();
                    contaLogada.sacar(valorSaque);
                    break;
                case 3:
                    System.out.print("Digite o valor para transferência: ");
                    double valorTransferencia = scanner.nextDouble();

                    System.out.print("Digite o número da conta destino: ");
                    int numeroDestino = scanner.nextInt();

                    Conta contaDestino = null;
                    for (Conta conta : contas) {
                        if (conta.getNumero() == numeroDestino) {
                            contaDestino = conta;
                            break;
                        }
                    }

                    if (contaDestino != null) {
                        contaLogada.transferir(contaDestino, valorTransferencia);
                    } else {
                        System.out.println("Conta destino não encontrada.");
                    }
                    break;
                case 4:
                    System.out.print("Digite o valor para pagamento: ");
                    double valorPagamento = scanner.nextDouble();
                    contaLogada.pagar(valorPagamento);
                    break;
                case 5:
                    System.out.printf("Saldo atual: R$ %.2f%n", contaLogada.getSaldo());
                    break;
                case 0:
                    System.out.println("Encerrando o sistema. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }
}
