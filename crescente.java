
import java.util.Scanner;
import java.util.Arrays;

public class crescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[3];

        System.out.print("Digite o primeiro número: ");
        numeros[0] = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        numeros[1] = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        numeros[2] = scanner.nextDouble();

        Arrays.sort(numeros);

        System.out.println("Ordem crescente:");
        for (double n : numeros) {
            System.out.println(n);
        }

        scanner.close();
    }
}