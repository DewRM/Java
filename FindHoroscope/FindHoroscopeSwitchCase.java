import java.util.Scanner;

public class FindHoroscopeSwitchCase {
    public static void main(String[] args) {
        int month, day;
        String horoscope = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Dogdugunuz ay: ");
        month = input.nextInt();

        System.out.print("Dogdugunuz gun: ");
        day = input.nextInt();

        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Burcunuz: Oglak";
                    } else {
                        horoscope = "Burcunuz: Kova";

                    }
                } else {
                    isError = true;
                }
                break;

            case 2:
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        horoscope = "Burcunuz: Kova";
                    } else {
                        horoscope = "Burcunuz: Balik";
                    }
                } else {
                    isError = true;
                }
                break;

            case 3:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        horoscope = "Burcunuz: Balik";
                    } else {
                        horoscope = "Burcunuz: Koc";
                    }
                } else {
                    isError = true;
                }
                break;

            case 4:
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        horoscope = "Burcunuz: Koc";
                    } else {
                        horoscope = "Burcunuz: Boga";
                    }
                } else {
                    isError = true;
                }
                break;

            case 5:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Burcunuz: Boga";
                    } else {
                        horoscope = "Burcunuz: Ikizler";
                    }
                } else {
                    isError = true;
                }
                break;

            case 6:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        horoscope = "Burcunuz: Ikizler";
                    } else {
                        horoscope = "Burcunuz: Yengec";
                    }
                } else {
                    isError = true;
                }
                break;

            case 7:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        horoscope = "Burcunuz: Yengec";
                    } else {
                        horoscope = "Burcunuz: Aslan";
                    }
                } else {
                    isError = true;
                }
                break;

            case 8:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        horoscope = "Burcunuz: Aslan";
                    } else {
                        horoscope = "Burcunuz: Basak";
                    }
                } else {
                    isError = true;
                }
                break;

            case 9:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        horoscope = "Burcunuz: Basak";
                    } else {
                        horoscope = "Burcunuz: Terazi";
                    }
                } else {
                    isError = true;
                }
                break;

            case 10:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        horoscope = "Burcunuz: Terazi";
                    } else {
                        horoscope = "Burcunuz: Akrep";
                    }
                } else {
                    isError = true;
                }
                break;

            case 11:
                if (day >= 1 && day <= 30) {
                    if (day < 22) {
                        horoscope = "Burcunuz: Akrep";
                    } else {
                        horoscope = "Burcunuz: Yay";
                    }
                } else {
                    isError = true;
                }
                break;

            case 12:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Burcunuz: Yay";
                    } else {
                        horoscope = "Burcunuz: Oglak";
                    }
                } else {
                    isError = true;
                }
                break;
            default:
                isError = true;
        }

        if (isError) {
            System.out.print("Hatali bir deger girdiniz!");
        }else {
            System.out.print(horoscope);
        }
    }
}
