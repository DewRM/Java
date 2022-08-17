public class asalSayi {
    public static void main(String[] args) {
        int number = -11;
        int remainder = number % 2;
        boolean isPrime = true;

        if (number < 0) {
            System.out.println("Negatif sayilar asal sayi degildir");
            return;
        }

        if (number == 1 || number == 0) {
            System.out.println("Sayi asal degildir!");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Sayi asaldir");
        } else {
            System.out.println("Sayi asal degildir!");
        }
    }
}

