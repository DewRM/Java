import java.util.Scanner;

public class GroceryStoreCashier {
    public static void main(String[] args) {

        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.00, armutKilosu, elmaKilosu, domatesKilosu, muzKilosu, patlicanKilosu, toplamTutar;

        Scanner input = new Scanner(System.in);


        System.out.print("Armut kac kilo? ");
        armutKilosu = input.nextDouble();

        System.out.print("Elma kac kilo? ");
        elmaKilosu = input.nextDouble();

        System.out.print("Domates kac kilo? ");
        domatesKilosu = input.nextDouble();

        System.out.print("Muz kac kilo? ");
        muzKilosu = input.nextDouble();

        System.out.print("Patlican kac kilo? ");
        patlicanKilosu = input.nextDouble();


        toplamTutar = (armutFiyat * armutKilosu) + (elmaFiyat * elmaKilosu) + (domatesFiyat * domatesKilosu) + (muzFiyat * muzKilosu) + (patlicanFiyat * patlicanKilosu);


        System.out.println("Toplam Tutar: " + toplamTutar);
    }
}
