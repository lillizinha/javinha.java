
import java.util.Scanner;

public class maiormenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o primeiro número: ");
        double a = scanner.nextDouble();

        System.out.print("digite o segundo número: ");
        double b = scanner.nextDouble();

        System.out.print("digite o terceiro número: ");
        double c = scanner.nextDouble();

        double maior = a;
        double menor = a;

        if (b > maior) maior = b;
        if (c > maior) maior = c;

        if (b < menor) menor = b;
        if (c < menor) menor = c;

        System.out.println("o maior número é: " + maior);
        System.out.println("o menor número é: " + menor);

        scanner.close();
    }
}
