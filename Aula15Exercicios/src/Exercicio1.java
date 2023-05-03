import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        if (checarParidade()){
        System.out.println("Todos os algarismos são pares.");}
        else{
            System.out.println("Há algarismo(s) impar(es).");
        }
    }

    public static boolean checarParidade() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = ler.nextInt();
        int teste = 10, algarismos = 1;

        while (true) {
            if (numero >= teste) {
                algarismos++;
                teste = teste * 10;
            } else {
                break;
            }
        }
        int divisao, comparador = 0;
        for (int i = (algarismos-1); i >= 0; i--) {
            divisao = numero / ((int) Math.pow(10, i));
            if (divisao%2==0){
                comparador++;
            }
        }
        boolean tudoPar = false;
        if (comparador==algarismos){
            tudoPar = true;
        }
        return tudoPar;

    }
}