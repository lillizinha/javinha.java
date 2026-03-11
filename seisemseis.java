 import java.util.Scanner;

public class seisemseis {
public static void main(String[] args) {

Scanner sono = new Scanner(System.in);  

    int num;  

    System.out.print("Digite um número: ");  
    num = sono.nextInt();  

    for(int i = 1; i <= 100; i++) {  
        num = num + 6;  
        System.out.println(num);  
    }  
}

}
