 import java.util.Scanner;

public class contasenha {
    public static void main(String[] args) {

        Scanner scpp = new Scanner(System.in);

        String usuario;
        int senha;
        int tentativa;

        System.out.print("crie seu nome de usuário: ");
        usuario = scpp.nextLine();

        System.out.print("crie a senha da sua conta ");
        senha = scpp.nextInt();

        System.out.println("\nconta criada, " + usuario + "!");

        do {
            System.out.print("digite sua senha para fazer login: ");
            tentativa = scpp.nextInt();
        } while(tentativa != senha);

        System.out.println("acesso liberadx!");
    }
}