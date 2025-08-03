import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe que gerencia operações relacionadas à busca de contas no sistema bancário.
 */
public class BancoUtils {

    /**
     * Busca uma conta pelo número.
     *
     * @param contas Lista de contas existentes.
     * @param numero Número da conta buscada.
     * @return Conta correspondente ou null se não encontrada.
     */
    public static Conta buscarConta(ArrayList<Conta> contas, int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    /**
     * Autentica um usuario perguntando pelo número da conta.
     *
     * @param contas Lista de contas existentes.
     * @param scanner Scanner para entrada de dados.
     * @return Conta autenticada ou null se não encontrada.
     */
    public static Conta autenticarConta(ArrayList<Conta> contas, Scanner scanner) {
        int tentativas = 0;
        final int MAX_TENTATIVAS = 3;

        while (tentativas < MAX_TENTATIVAS) {
            System.out.print("Digite o número da sua conta: ");
            int numeroConta = scanner.nextInt();

            Conta contaLogada = buscarConta(contas, numeroConta);

            if (contaLogada != null) {
                return contaLogada;
            }

            tentativas++;
            int tentativasRestantes = MAX_TENTATIVAS - tentativas;

            if (tentativasRestantes > 0) {
                System.out.printf("Conta não encontrada. Tente novamente. (%d tentativas restantes)%n", tentativasRestantes);
            } else {
                System.out.println("Número máximo de tentativas atingido.");
                System.out.println("Encerrando o sistema. Obrigado!");
            }
        }

        return null;
    }
}
