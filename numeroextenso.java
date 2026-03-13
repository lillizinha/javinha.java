import java.util.Scanner;

public class numeroextenso {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int dezena;
        int unidade;

        System.out.print("Digite um número de 1 a 100: ");
        numero = sc.nextInt();

        if(numero == 100){
            System.out.println("Cem");
        }
        else if(numero >= 1 && numero <= 99){

            dezena = numero / 10;
            unidade = numero % 10;

            switch(dezena){

                case 0:
                    switch(unidade){
                        case 1: System.out.println("Um"); break;
                        case 2: System.out.println("Dois"); break;
                        case 3: System.out.println("Três"); break;
                        case 4: System.out.println("Quatro"); break;
                        case 5: System.out.println("Cinco"); break;
                        case 6: System.out.println("Seis"); break;
                        case 7: System.out.println("Sete"); break;
                        case 8: System.out.println("Oito"); break;
                        case 9: System.out.println("Nove"); break;
                    }
                    break;

                case 1:
                    switch(unidade){
                        case 0: System.out.println("Dez"); break;
                        case 1: System.out.println("Onze"); break;
                        case 2: System.out.println("Doze"); break;
                        case 3: System.out.println("Treze"); break;
                        case 4: System.out.println("Quatorze"); break;
                        case 5: System.out.println("Quinze"); break;
                        case 6: System.out.println("Dezesseis"); break;
                        case 7: System.out.println("Dezessete"); break;
                        case 8: System.out.println("Dezoito"); break;
                        case 9: System.out.println("Dezenove"); break;
                    }
                    break;

                case 2: System.out.print("Vinte"); break;
                case 3: System.out.print("Trinta"); break;
                case 4: System.out.print("Quarenta"); break;
                case 5: System.out.print("Cinquenta"); break;
                case 6: System.out.print("Sessenta"); break;
                case 7: System.out.print("Setenta"); break;
                case 8: System.out.print("Oitenta"); break;
                case 9: System.out.print("Noventa"); break;
            }

            if(dezena >= 2 && unidade != 0){

                System.out.print(" e ");

                switch(unidade){
                    case 1: System.out.print("Um"); break;
                    case 2: System.out.print("Dois"); break;
                    case 3: System.out.print("Três"); break;
                    case 4: System.out.print("Quatro"); break;
                    case 5: System.out.print("Cinco"); break;
                    case 6: System.out.print("Seis"); break;
                    case 7: System.out.print("Sete"); break;
                    case 8: System.out.print("Oito"); break;
                    case 9: System.out.print("Nove"); break;
                }
            }

        } else {
            System.out.println("Número inválido.");
        }

        sc.close();
    }
}