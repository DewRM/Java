import java.util.Scanner;

public class KdvCalculator {
    public static void main(String[] args) {
        double fiyat, kdvOrani = 0.18, kdvTutari, kdvliFiyat, kdvSecimi;
        Scanner input = new Scanner(System.in);
        System.out.print("Urun Fiyati : ");
        fiyat = input.nextDouble();

        kdvTutari = fiyat * kdvOrani;
        kdvliFiyat = fiyat + kdvTutari;

        boolean  kosul = fiyat >= 1000;
        kdvSecimi = kosul ? 0.8 : 0.18;
        kdvTutari = (fiyat * kdvSecimi);

        System.out.println("KDV'siz Fiyat= " + fiyat);
        System.out.println("KDV Orani= " + kdvSecimi);
        System.out.println("KDV Tutari= " + kdvTutari);
        System.out.println("KDVL'li Fiyat= " + kdvliFiyat);
    }
}
