 import java.util.Scanner;

public class multitres {
    public static void main(String[] args) {

        Scanner cute = new Scanner(System.in);

        int a, b;

        System.out.print("Digite o primeiro número: ");
        a = cute.nextInt();

        System.out.print("Digite o segundo número: ");
        b = cute.nextInt();

        if(a < b) {
            for(int i = a; i <= b; i++) {
                if(i % 3 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            for(int i = a; i >= b; i--) {
                if(i % 3 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}