import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;
        double c, cevre, alan;

        System.out.print("A Kenarinin Uzunlugunu Giriniz: ");
        a = input.nextInt();

        System.out.print("B Kenarinin Uzunlugunu Giriniz: ");
        b = input.nextInt();

        c = Math.sqrt ((a*a) + (b*b));
        System.out.println("C Kenarinin Uzunlugu: " + c);

        cevre = a + b + c;
        alan = (a * b) / 2;
        System.out.println("Ucgenin Cevresi = " + cevre);
        System.out.print("Ucgenin Alani = " + alan);
    }
}
