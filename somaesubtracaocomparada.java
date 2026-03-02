
import java.util.Scanner;

public class somaesubtracaocomparada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        if (n2 > n1) {
            System.out.println("Soma: " + (n1 + n2));
        } else if (n1 > n2) {
            System.out.println("Subtração: " + (n1 - n2));
        } else {
            System.out.println("Os números são iguais.");
        }

        scanner.close();
    }
}