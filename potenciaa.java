 import java.util.Scanner;

public class potenciaa {
    public static void main(String[] args) {

        Scanner scpp = new Scanner(System.in);

        int base, expoente;
        int resultado = 1;

        System.out.print("digite o número da base: ");
        base = scpp.nextInt();

        System.out.print("digite o expoente (número que vai elevar): ");
        expoente = scpp.nextInt();

        for(int i = 1; i <= expoente; i++) {
            resultado = resultado * base;
        }

        System.out.println("Resultado: " + resultado);
    }
}