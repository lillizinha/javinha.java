
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.LocalTime;

public class cadastroidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu ano de nascimento (ex: 2008): ");
        int ano = scanner.nextInt();

        LocalDate hoje = LocalDate.now();
        int idade = hoje.getYear() - ano;

        int hora = LocalTime.now().getHour();
        String saudacao;

        if (hora >= 6 && hora < 12) {
            saudacao = "Bom dia";
        } else if (hora >= 12 && hora < 18) {
            saudacao = "Boa tarde";
        } else {
            saudacao = "Boa noite";
        }

        System.out.println(saudacao + ", " + nome + "!");

        if (idade >= 18) {
            System.out.println("Entrada liberada. Você é maior de idade.");
        } else {
            System.out.println("Entrada NÃO liberada. Você é menor de idade.");
        }

        scanner.close();
    }
}