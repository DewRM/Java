import java.util.Scanner;

public class LoginUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, pass, change, passNew;

        System.out.print("Kullanici adiniz: ");
        userName = input.nextLine();

        System.out.print("Sifreniz: ");
        pass = input.nextLine();

        if (userName.equals("patika") && pass.equals("java123")) {
            System.out.println("Giris Basarili!");
        } else {
            System.out.print("Giris Basarisiz! ");
            System.out.println("Sifrenizi degistirmek ister misiniz? \n1-Evet\n2-Hayir ");
            change = input.nextLine();
            if (change.equals("1")) {
                System.out.print("Yeni sifrenizi giriniz: ");
                passNew = input.nextLine();
                if (passNew.equals("java123")) {
                    System.out.print("Yeni sifreniz eski sifrenizden farkli olmalidir. Baska sifre yaziniz.");
                } else {
                    System.out.print("Yeni sifreniz olusturuldu.");
                }
            } else {
                System.out.print("Yeni sifre olusturmaktan vazgectiniz.");
            }
        }
    }
}


