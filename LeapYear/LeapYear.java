import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        int year;
        Scanner input = new Scanner(System.in);

        double mod;

        System.out.print("Year: ");
        year = input.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.print(year + " bir artik yildir!");
                } else {
                    System.out.print(year + " bir artik yil degildir!");
                }
            } else {
                System.out.print(year + " bir artik yildir!");
            }
        } else {
            System.out.print(year + " bir artik yil degildir!");
        }
    }
}



