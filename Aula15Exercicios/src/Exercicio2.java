import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        if (checarVogal()) {
            System.out.println("Todas as letras são vogais.");
        } else {
            System.out.println("Há letra(s) consoante(s).");
        }
    }

    public static boolean checarVogal() {
        Scanner ler = new Scanner(System.in);
        boolean vogal = true;
        System.out.println("Digite um conjunto de caracteres para verificação: ");
        String caracteres = ler.nextLine();
        for (int i = 0; i < caracteres.length(); i++) {
            char letra = caracteres.charAt(i);
            if (letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u' && letra != 'A' &&
                    letra != 'E' && letra != 'I' && letra != 'O' && letra != 'U') {
                vogal = false;
            }
        }
        return vogal;

    }
}