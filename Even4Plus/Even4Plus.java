import java.util.Scanner;

public class Even4Plus {
    public static void main(String[] args) {
        int n, total = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Bir Sayi Giriniz : ");
            n = input.nextInt();
            if (n % 2 == 0 && n % 4 == 0) {
                total += n;
            }
        } while (n % 2 == 0);
        System.out.println("Toplam = " + total);
    }
}


