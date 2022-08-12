import java.util.Scanner;

public class FindNumbers {
    public static void main(String[] args) {
        int k, toplam = 0, bolunenSayilar = 0;
        double median;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayiyi giriniz: ");
        k = input.nextInt();

        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println("3 ve 4'e Bolunebilen Sayilar: "+i);
                toplam += i;
                bolunenSayilar++;
            }
        }
        median = toplam / (bolunenSayilar - 1);
        System.out.println("Bolunebilen Sayilarin Aritmetik Ortalamasi: " + median);
    }
}
