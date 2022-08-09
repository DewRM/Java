import java.util.Scanner;

public class ActivityByWeather {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sicaklik, kayak, sinema, piknik, yuzme;
        System.out.print("Sicaklik Degerini Giriniz: ");
        sicaklik = input.nextInt();

        if (sicaklik < 5){
            System.out.print("Kayak yapmaya gidebilirsiniz.");
        }
        if (sicaklik <= 5 && sicaklik <= 15){
            System.out.print("Sinemaya gidebilirsiniz.");
        }
        if (sicaklik <= 15 && sicaklik <= 25){
            System.out.print("Piknige gidebilirsiniz.");
        }
        if (sicaklik > 25){
            System.out.print("Yuzmeye gidebilirsiniz.");
        }
    }
}



