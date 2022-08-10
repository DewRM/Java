import java.util.Scanner;

public class FlyTickets {
    public static void main(String[] args) {

        double distance, age, type;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM Olarak Giriniz: ");
        distance = input.nextDouble();
        double price = (distance * 0.1);

        System.out.print("Yasiniz: ");
        age = input.nextDouble();
        if (age < 12 && age >= 0) {
            price = ((price) - (price * 0.5));
        } else if (age >= 12 && age <= 24) {
            price = ((price) - (price * 0.1));
        } else if (age >= 25 && age <= 64) {
            price = (price);
        } else if (age >= 65) {
            price = ((price) - (price * 0.5));
        } else System.out.print("Hatali Bir Giris Yaptiniz!\n");

        System.out.print("Yolculuk Tipini Seciniz: 1-Tek Yon | 2-Gidis-Donus: ");
        type = input.nextDouble();
        if (type == 1) {
            System.out.print("Yolculuk Tipi Tek Yon ve Toplam Tutar: " + (price));
        } else if (type == 2) {
            System.out.print("Yolculuk Tipi Gidis-Donus ve Toplam Tutar: " + ((price) - (price * 0.2)));
        } else System.out.println("Hatali Bir Giris Yaptiniz!");
    }
}

