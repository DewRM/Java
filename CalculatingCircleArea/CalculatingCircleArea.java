import java.util.Scanner;

public class CalculatingCircleArea {
    public static void main(String[] args) {

        double a, r, alan, cevre, pi= 3.14, daireDilimi;

        Scanner input = new Scanner(System.in);
        System.out.print("Daireye bir yari cap giriniz: ");
        r = input.nextDouble();

        System.out.print("Merkez aci olcusu giriniz: ");
        a = input.nextDouble();

        alan = pi * r * r;
        cevre = 2 * pi * r;
        daireDilimi = (pi * (r*r) * a) / 360;

        System.out.println("Dairenin Cevresi : "+cevre);
        System.out.println("Dairenin Alani : "+ alan);
        System.out.println("Daire Diliminin Alani : "+ daireDilimi);
    }
}


