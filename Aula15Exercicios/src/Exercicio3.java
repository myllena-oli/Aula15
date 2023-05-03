import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        if (checarSenha()) {
            System.out.println("Senha válida.");
        } else {
            System.out.println("Senha invalida.");
        }
    }

    public static boolean checarSenha() {
        Scanner ler = new Scanner(System.in);
        boolean verificar = true;
        System.out.println("Digite uma senha para verificação: ");
        String senha = ler.nextLine();
        if (senha.length() < 10) {
            verificar = false;
        }
        int digito = 0;

        for (int i = 0; i < senha.length(); i++) {
            char letra = senha.charAt(i);
            if (Character.isLetterOrDigit(letra) == false) {
                verificar = false;
                break;
            }
            if (Character.isDigit(letra)) {
                digito++;
            }

        }
        if (digito < 2) {
            verificar = false;
        }
        return verificar;

    }
}