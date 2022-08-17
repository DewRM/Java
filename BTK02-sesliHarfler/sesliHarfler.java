package JavaBTK;

public class sesliHarfler {
    public static void main(String[] args) {
        char harf = 'M';

        switch (harf) {
            case 'A' | 'a':
            case 'I' | 'ı':
            case 'U' | 'u':
            case 'O' | 'o':
                System.out.println("Kalin bir sestir");
                break;
            case 'E' | 'e':
            case 'Ü' | 'ü':
            case 'Ö' | 'ö':
                System.out.println("Ince bir sestir");
            default:
                System.out.println("Lutfen sesli bir harf giriniz!");
        }
    }
}

