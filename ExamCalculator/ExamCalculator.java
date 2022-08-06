import java.util.Scanner;

public class ExamCalculator {
    public static void main(String[] args) {
        // Degiskenleri olustur
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sinifini tanimla
        Scanner input = new Scanner(System.in);

        // Kullanicidan verileri al
        System.out.println("Matematik Notunuz = ");
        mat = input.nextInt();

        System.out.println("Fizik Notunuz = ");
        fizik = input.nextInt();

        System.out.println("Kimya Notunuz = ");
        kimya = input.nextInt();

        System.out.println("Turkce Notunuz = ");
        turkce = input.nextInt();

        System.out.println("Tarih Notunuz = ");
        tarih = input.nextInt();

        System.out.println("Muzik Notunuz = ");
        muzik = input.nextInt();

        // Ortalama Hesaplama
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.println("Ortalamaniz = " + sonuc);

        // Kosul Koyma
        System.out.println( sonuc >= 60 ? "Gecti" : "Kaldi");
    }
}

