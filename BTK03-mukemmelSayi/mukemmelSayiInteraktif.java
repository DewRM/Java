import java.util.Scanner;

public class mukemmelSayiInteraktif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int total = 0;

        System.out.println("Bir sayi giriniz: ");
        number = input.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {
            System.out.println("Bu mukemmel bir sayidir!");
        } else {
            System.out.println("Bu mukemmel bir sayi degildir!");
        }
    }
}
