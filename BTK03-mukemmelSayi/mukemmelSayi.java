public class mukemmelSayi {
    public static void main(String[] args) {
        int number = 28;
        int total = 0;

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
