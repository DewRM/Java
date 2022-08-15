import java.sql.SQLOutput;
import java.util.Scanner;

public class ExponentialNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, k, total = 1;
        System.out.print("Ussu alinacak sayi: ");
        n = input.nextInt();
        System.out.print("Us olacak sayi: ");
        k = input.nextInt();

        // formula explain: 3^4 = 3*3*3*3
        for (int i = 1; i <= k; i++){
            total *= n;
        }
        System.out.println("Sonuc: "+ total);
    }
}
