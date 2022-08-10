import java.sql.SQLOutput;
import java.util.Scanner;

public class FindHoroscopeIfElse {
    public static void main(String[] args) {

        int month, day;
        Scanner input = new Scanner(System.in);

        System.out.print("Dogdugunuz Ay: ");
        month = input.nextInt();

        System.out.print("Dogdugunuz Gun: ");
        day = input.nextInt();

        if ((month = 1 && day >= 1 && day <=21) || (month = 12 && day >= 22 && day <= 31)) {
            System.out.print("Burcunuz Oglak");
        }
    }
}
