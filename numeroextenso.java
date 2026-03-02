
import java.util.Scanner;

public class numeroextenso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 100: ");
        int numero = scanner.nextInt();

        String[] unidades = {
            "", "um", "dois", "três", "quatro", "cinco",
            "seis", "sete", "oito", "nove"
        };

        String[] especiais = {
            "dez", "onze", "doze", "treze", "quatorze",
            "quinze", "dezesseis", "dezessete",
            "dezoito", "dezenove"
        };

        String[] dezenas = {
            "", "", "vinte", "trinta", "quarenta",
            "cinquenta", "sessenta", "setenta",
            "oitenta", "noventa"
        };

        if (numero < 1 || numero > 100) {
            System.out.println("Número fora do intervalo.");
        } else if (numero == 100) {
            System.out.println("cem");
        } else if (numero < 10) {
            System.out.println(unidades[numero]);
        } else if (numero < 20) {
            System.out.println(especiais[numero - 10]);
        } else {
            int dez = numero / 10;
            int un = numero % 10;

            if (un == 0) {
                System.out.println(dezenas[dez]);
            } else {
                System.out.println(dezenas[dez] + " e " + unidades[un]);
            }
        }

        scanner.close();
    }
}