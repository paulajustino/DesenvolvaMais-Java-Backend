public class SegurancaUtils {

    public static boolean validarSenhaForte(String senha) {
        boolean validaQuantidadeDeCaracteres = senha.length() > 8;
        boolean validaPresencaDeNumero = senha.matches(".*\\d.*");

        return validaQuantidadeDeCaracteres && validaPresencaDeNumero;
    }
}
