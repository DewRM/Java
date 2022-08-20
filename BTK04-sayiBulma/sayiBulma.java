import java.util.Scanner;

public class sayiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] sayilar = {1, 2, 5, 7, 9, 0};
        int aranacak;
        boolean varMi = false;

        System.out.print("Aranacak sayiyi giriniz: ");
        aranacak = input.nextInt();

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            System.out.println("Sayi mevcuttur.");
        } else System.out.println("Sayi mevcut degildir!");
    }
}