import java.util.Scanner;

public class CalculationCombination {
    public static void main(String[] args) {
        // combination formula: C(n,r) = n! / (r! * (n-r)!)
        int n, r, nfac = 1, rfac = 1; // default values are 1 for factorials
        Scanner input = new Scanner(System.in);

        // ask for combination inputs
        System.out.print("Kombinasyonunu almak istediginiz deger: ");
        n = input.nextInt();
        System.out.print(n + "'sayisinin kacli kombinasyonu alinsin: ");
        r = input.nextInt();

        if ((n >= 0) && (r >=0))  // if inputs are natural do the following
        {
            System.out.print(n + "'sayisinin " + r + "'ile kombinasyonu = ");
            while (r >= 1)        // *simple formula for combination
            {
                nfac *= n;
                rfac *= r;
                --n;
                --r;
            }
            int combination = (nfac / rfac);  // *
            System.out.println(combination);

            System.out.println("Kombinasyon alma islemi tamamlandi!");
        }
        else                  // if inputs are not natural
        {
            System.out.println("Lutfen negatif sayi girmeyiniz.");
        }
    }
}
/* int r = input.nextInt(); */
