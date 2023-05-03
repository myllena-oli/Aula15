import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        System.out.println("É equivalente a " + conversorPolegasParaMetros() + " metros.");
    }

    public static double conversorPolegasParaMetros() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número em polegadas: ");
        double polegadas = ler.nextDouble();

        double metros = 0.0254 * polegadas;

        return metros;

    }
}