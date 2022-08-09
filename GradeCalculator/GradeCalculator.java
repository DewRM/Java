import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double mat, fizik, kimya, turkce, muzik, ortalama;
        System.out.print("Matematik Notu: ");
        mat = input.nextDouble();

        System.out.print("Fizik Notu: ");
        fizik = input.nextDouble();

        System.out.print("Kimya Notu: ");
        kimya = input.nextDouble();

        System.out.print("Turkce Notu: ");
        turkce = input.nextDouble();

        System.out.print("Muzik Notu: ");
        muzik = input.nextDouble();

        if (mat < 0 || mat > 100){
            mat = 0;
        }
        if (fizik < 0 || fizik > 100){
            fizik = 0;
        }
        if (kimya < 0 || kimya > 100){
            kimya = 0;
        }
        if (turkce < 0 || turkce > 100){
            turkce = 0;
        }
        if (muzik < 0 || muzik > 100){
            muzik = 0;
        }

        ortalama = (mat + fizik + kimya + turkce + muzik) / 5;
        System.out.println("Ortalamaniz: " + ortalama);

        if (ortalama >= 55) {
            System.out.println("Tebrikler, Gectiniz!");
        }
        else {
            System.out.println("Maalesef Kaldiniz!");
        }
    }
}
