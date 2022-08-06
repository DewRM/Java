import java.util.Scanner;

public class CalculatingTriangleArea {
    public static void main(String[] args) {
        // Degiskenler
                int a, b;
                double c;

        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenari Giriniz = ");
        a = girdi.nextInt();
        System.out.print("2. Kenari Giriniz = ");
        b = girdi.nextInt();

        c= Math.sqrt((a*a) + (b*b));
        System.out.print("Hipotenus Degeri = " + c);
    }
}
