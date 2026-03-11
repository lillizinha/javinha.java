 public class numprimos {
    public static void main(String[] args) {

        int soma = 0;

        for(int num = 1; num <= 50; num++) {

            int divisores = 0;

            for(int i = 1; i <= num; i++) {
                if(num % i == 0) {
                    divisores++;
                }
            }

            if(divisores == 2) {
                System.out.println(num);
                soma += num;
            }
        }

        System.out.println("a soma dos primos: " + soma);
    }
}