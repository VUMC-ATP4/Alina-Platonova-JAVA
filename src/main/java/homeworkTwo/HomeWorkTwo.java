package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {

    public static void main(String[] args) {

        System.out.println("\nTHIS IS HOMEWORK NR.2");

        // 1. uzdevums
        System.out.println("1. uzdevums");
        int x = 6;
        // a. variants
        System.out.println(x > 0);
        // b. variants
        System.out.println(x < 0);
        // c. variants
        System.out.println(x > 5 && x <= 10);
        // d. variants
        System.out.println(!(x <= 5) || x < 10);
        // e. variants
        System.out.println(x == 0 || x == 10);
        // f. variants
        System.out.println((x*x) > 10);

        // 2. uzdevums
        System.out.println("\n2. uzdevums");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi mēneša ciparu");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 3:
                System.out.println("Marts");
                break;
            case 4:
                System.out.println("Aprīlis");
                break;
            case 5:
                System.out.println("Maijs");
                break;
            case 6:
                System.out.println("Jūnijs");
                break;
            case 7:
                System.out.println("Jūlijs");
                break;
            case 8:
                System.out.println("Augusts");
                break;
            case 9:
                System.out.println("Septembris");
                break;
            case 10:
                System.out.println("Oktobris");
                break;
            case 11:
                System.out.println("Novembris");
                break;
            case 12:
                System.out.println("Decembris");
                break;
            default:
                System.out.println("Mēnesis " + month + " nav definēts");
        }

        // 3. uzdevums
        System.out.println("\n3. uzdevums");

        int b;
        int c;
        int d;

        Scanner salidzina = new Scanner(System.in);
        System.out.println("Ievadi pirmo skaitli");
        b = salidzina.nextInt();
        System.out.println("Ievadi otro skaitli");
        c = salidzina.nextInt();
        System.out.println("Ievadi trešo skaitli");
        d = salidzina.nextInt();

        if (b > c && b > d) {
            System.out.println("Lielākais skaitlis ir " + b);
        } else if (c > b && c > d) {
            System.out.println("Lielākais skaitlis ir " + c);
        } else {
            System.out.println("Lielākais skaitlis ir " + d);
        }

        // 4. uzdevums
        System.out.println("\n4. uzdevums");

        Scanner luksofors = new Scanner(System.in);
        System.out.println("Kāda krāsa luksoforā?");
        String krasa = luksofors.nextLine();
        if (krasa.equals("Sarkana")) {
            System.out.println("Stāviet!");
        } else if (krasa.equals("Dzeltena")) {
            System.out.println("Gaidiet!");
        } else if (krasa.equals("Zaļa")) {
            System.out.println("Ejiet pāri ielai!");
        } else {
            System.out.println("Tādas krāsas luksoforā nav!");
        }

        // 5. uzdevums
        System.out.println("\n5. uzdevums");
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();

        // 6. uzdevums
        System.out.println("\n6. uzdevums");
        printBusinessCardTwo("Līga", "Kalniņa", "+371 12312313", 1965);
        printBusinessCardTwo("Juris", "Vītols", "+371 5142431", 1930);

        // 7. uzdevums
        System.out.println("\n7. uzdevums");
        int summa = sum(7, 4);
        System.out.println(summa);

        // 8. uzdevums
        System.out.println("\n8. uzdevums");
        System.out.println(average(10,2,4));
    }


    // Metodes
    static void printBusinessCard() {
        System.out.println("Vizītkarte");
        System.out.println("############");
        System.out.println("Vārds: Jānis");
        System.out.println("Uzvārds: Bērziņš");
        System.out.println("Telefona numurs: +371 12345678");
        System.out.println("Dzimšanas gads: 1990");
        System.out.println("############");
    }

    static void printBusinessCardTwo(String name, String surname, String telephone, int dateOfBirth) {
        System.out.println("Vizītkarte");
        System.out.println("############");
        System.out.println("Vārds: " + name);
        System.out.println("Uzvārds: " + surname);
        System.out.println("Telefona numurs: " + telephone);
        System.out.println("Dzimšanas gads: " + dateOfBirth);
        System.out.println("############");
    }

    static int sum(int a, int b) {
        return a+b;
    }

    static double average(double c, double d, double e) {
        return (c+d+e)/3;
    }

}
