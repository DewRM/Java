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

        if (month == 1 && day >= 1 && day <= 21 || month == 12 && day >= 22 && day <= 31) {
            System.out.print("Burcunuz Oglak");
        }
        if (month == 1 && day >= 22 && day <= 31 || month == 2 && day >= 1 && day <= 19) {
            System.out.print("Burcunuz Kova");
        }
        if (month == 2 && day >= 20 && day <= 28 || month == 3 && day >= 1 && day <= 20) {
            System.out.print("Burcunuz Balik");
        }
        if (month == 3 && day >= 21 && day <= 31 || month == 4 && day >= 1 && day <= 20) {
            System.out.print("Burcunuz Koc");
        }
        if (month == 4 && day >= 21 && day <= 30 || month == 5 && day >= 1 && day <= 21) {
            System.out.print("Burcunuz Boga");
        }
        if (month == 5 && day >= 22 && day <= 31 || month == 6 && day >= 1 && day <= 22) {
            System.out.print("Burcunuz Ikizler");
        }
        if (month == 6 && day >= 23 && day <= 30 || month == 7 && day >= 1 && day <= 22) {
            System.out.print("Burcunuz Yengec");
        }
        if (month == 7 && day >= 23 && day <= 31 || month == 8 && day >= 1 && day <= 22) {
            System.out.print("Burcunuz Aslan");
        }
        if (month == 8 && day >= 23 && day <= 31 || month == 9 && day >= 1 && day <= 22) {
            System.out.print("Burcunuz Basak");
        }
        if (month == 9 && day >= 23 && day <= 30 || month == 10 && day >= 1 && day <= 22) {
            System.out.print("Burcunuz Terazi");
        }
        if (month == 10 && day >= 23 && day <= 31 || month == 11 && day >= 1 && day <= 21) {
            System.out.print("Burcunuz Akrep");
        }
        if (month == 11 && day >= 22 && day <= 30 || month == 12 && day >= 1 && day <= 21) {
            System.out.print("Burcunuz Yay");
        } else System.out.print("Hatali bir deger girdiniz!");

    }
}


