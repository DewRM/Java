import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double para, paraKdv, kdvTutar, kdv;
        boolean kosul;

        System.out.print("KDV'sini Hesaplamak Istediginiz Tutari Giriniz: ");
        para = scan.nextInt();

        kosul = 1000 < para;
        kdv = kosul ? 0.08 : 0.18;

        kdvTutar = kdv * para;
        paraKdv = kdvTutar + para;

        System.out.println("KDV Orani = " + kdv);
        System.out.println("KDV Tutari = " + kdvTutar);
        System.out.println("KDV'siz Fiyat = " + para);
        System.out.println("KDV'li Fiyat = " + paraKdv);
    }
}
