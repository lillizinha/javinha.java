import java.util.Scanner;
import java.util.Arrays;

public class boletim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] notasAlunos = new double[10][4];
        for (int i = 0; i < 10; i++) {
            System.out.println("\nAluno " + (i + 1) + ":");
            for (int a = 0; a < 4; j++) {
                System.out.print("Digite a nota " + (a + 1) + ": ");
                notasAlunos[i][a] = scanner.nextDouble();
            }
        }
        System.out.println("\n" + "=".repeat(50));
        System.out.println("RESULTADOS POR ALUNO:");
        System.out.println("=".repeat(50));
        
        for (int i = 0; i < 10; i++) {
            double soma = 0;
            double maior = notasAlunos[i][0];
            double menor = notasAlunos[i][0];
            
            for (int a = 0; a < 4; j++) {
                soma += notasAlunos[i][j];
                
                if (notasAlunos[i][a] > maior) {
                    maior = notasAlunos[i][j];
                }
                
                if (notasAlunos[i][a] < menor) {
                    menor = notasAlunos[i][j];
                }
            }
            
            double media = soma / 4;
            
            System.out.printf("Aluno %d - Média: %.2f | Maior: %.2f | Menor: %.2f%n", 
                            (i + 1), media, maior, menor);
        }
        
        scanner.close();
    }
}



