 import java.util.Scanner;

public class tabuada {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);  
    int num;  

    System.out.print("digite um número vibes: ");  
    num = sc.nextInt();  

    System.out.println("\nTABUADA DE ADIÇÃO VIBES");  
    for(int i = 1; i <= 10; i++){  
        System.out.println(num + " + " + i + " = " + (num + i));  
    }  

    System.out.println("\nTABUADA DE SUBTRAÇÃO VIBES");  
    for(int i = 1; i <= 10; i++){  
        System.out.println(num + " - " + i + " = " + (num - i));  
    }  

    System.out.println("\nTABUADA DE MULTIPLICAÇÃO VIBES");  
    for(int i = 1; i <= 10; i++){  
        System.out.println(num + " * " + i + " = " + (num * i));  
    }  

    System.out.println("\nTABUADA DE DIVISÃO VIBESS");  
    for(int i = 1; i <= 10; i++){  
        System.out.println(num + " / " + i + " = " + (num / (double)i));  
    }  

}

}