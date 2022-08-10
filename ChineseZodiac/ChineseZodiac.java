import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {

        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Year of Birth: ");
        year = input.nextInt();

        switch (year % 12){
            case 0:
                System.out.print("Your Zodiac: Monkey");
                break;
            case 1:
                System.out.print("Your Zodiac: Rooster");
                break;
            case 2:
                System.out.print("Your Zodiac: Dog");
                break;
            case 3:
                System.out.print("Your Zodiac: Pig");
                break;
            case 4:
                System.out.print("Your Zodiac: Rat");
                break;
            case 5:
                System.out.print("Your Zodiac: Ox");
                break;
            case 6:
                System.out.print("Your Zodiac: Tiger");
                break;
            case 7:
                System.out.print("Your Zodiac: Rabbit");
                break;
            case 8:
                System.out.print("Your Zodiac: Dragon");
                break;
            case 9:
                System.out.print("Your Zodiac: Snake");
                break;
            case 10:
                System.out.print("Your Zodiac: Horse");
                break;
            case 11:
                System.out.print("Your Zodiac: Sheep");
                break;
        }
    }
}
