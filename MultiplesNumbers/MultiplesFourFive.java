import java.util.Scanner;

public class MultiplesFourFive {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sinir sayisini giriniz: ");
        n = input.nextInt();

        System.out.println("\n4'un Katlari: ");
        for (int i=1; i < n; i*=4){
            System.out.println(i);
        }
        System.out.println("\n5'in Katlari: ");
        for (int i=1; i < n; i*=5){
            System.out.println(i);
        }
    }
}
