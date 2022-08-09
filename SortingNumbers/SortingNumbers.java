import java.sql.SQLOutput;
import java.util.Scanner;

public class SortingNumbers {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner input = new Scanner(System.in);

        System.out.print("Ilk sayiyi giriniz: ");
        n1 = input.nextInt();

        System.out.print("Ikinci sayiyi giriniz: ");
        n2 = input.nextInt();

        System.out.print("Ucuncu sayiyi giriniz: ");
        n3 = input.nextInt();

        if ((n1 > n2) && (n1 > n3)){
            if (n2 > n3) {
                System.out.println("Siralama: n1 > n2 > n3");
            }
            else {
                System.out.println("Siralama: n1 > n3 > n2");
            }
        }
        else if ((n2 > n1) && (n3 > n1)){
            if (n2 > n3) {
                System.out.println("Siralama: n2 > n3 > n1");
            }
            else {
                System.out.println("Siralama: n3 > n2 > n1");
            }
        }
        else {
            System.out.println("Siralama: n2 > n1 > n3");
        }
    }
}
