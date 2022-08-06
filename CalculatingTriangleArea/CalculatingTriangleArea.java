import java.util.Scanner;

public class UcgeninAlani {
    public static void main(String[] args) {
        Scanner ucgen = new Scanner(System.in);

        double a, b, c, u, cevre, alan;

        System.out.print("A Kenarini Giriniz: ");
        a = ucgen.nextDouble();

        System.out.print("B Kenarini Giriniz: ");
        b = ucgen.nextDouble();

        System.out.print("C Kenarini Giriniz: ");
        c = ucgen.nextDouble();

        u = (a + b + c) / 2;
        cevre = 2 * u;
        alan = (a * b) /  2;

        System.out.println("Cevresi: " + cevre);
        System.out.print("Alani: " + alan);
    }
}
