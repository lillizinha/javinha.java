
import java.time.LocalTime;

public class horaaa {
    public static void main(String[] args) {

        int hora = LocalTime.now().getHour();

        if (hora >= 6 && hora < 12) {
            System.out.println("bom diaa");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("boa tarde :)");
        } else if (hora >= 18 && hora < 23) {
            System.out.println("boa noite zz");
        } else {
            System.out.println("vai dormir!");
        }
    }
}