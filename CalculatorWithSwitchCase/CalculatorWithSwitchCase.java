package CalculatorWithSwitchCase;

import java.util.Scanner;

public class CalculatorWithSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, islem;

        System.out.print("Birinci sayiyi giriniz: ");
        n1 = input.nextInt();

        System.out.print("Ikinci sayiyi giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Islem Seciminiz: ");
        islem = input.nextInt();

        switch (islem) {
            case 1:
                System.out.print("Toplama: " + (n1 + n2));
                break;
            case 2:
                System.out.print("Cikarma: " + (n1 - n2));
                break;
            case 3:
                System.out.print("Carpma: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.print(n1 / n2);
                } else {
                    System.out.print("0 ile bolme islemi yapilamaz!");
                }
                break;
            default:
                System.out.print("Hatali bir giris yaptiniz!");
        }
    }
}



