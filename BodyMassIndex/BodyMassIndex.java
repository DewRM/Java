import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double boy, kilo, formul;

        Scanner input = new Scanner(System.in);

        System.out.print(" Boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();

        System.out.print(" Kilonuzu kg cinsinden giriniz: ");
        kilo = input.nextDouble();

        formul = kilo / (boy * boy);

        System.out.println("Vucut Kitle Indeksiniz: " + formul);
    }
}
