import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        diaDaSemana();

    }

    public static void diaDaSemana() {
        Scanner ler = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.println("Digite um número entre 1 e 7: ");
            numero = ler.nextInt();
            if (numero < 1 || numero > 7) {
                System.out.println("O número está fora do intervalo. ");
            } else {
                break;
            }

        }

        switch (numero) {
            case 1:
                System.out.println("Domingo.");
                break;
            case 2:
                System.out.println("Segunda-Feira.");
                break;
            case 3:
                System.out.println("Terça-feira.");
                break;
            case 4:
                System.out.println("Quarta-feira.");
                break;
            case 5:
                System.out.println("Quinta-feira.");
                break;
            case 6:
                System.out.println("Sexta-feira.");
                break;

            default:
                System.out.println("Sábado. ");
        }

    }
}