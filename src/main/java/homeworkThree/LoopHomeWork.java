package homeworkThree;

import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
        System.out.println("\nTHIS IS HOMEWORK NR.3");

        // 1. uzdevums
        System.out.println("1. uzdevums");

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while ( number <= 100) {
            System.out.println("Ievadi skaitli");
            number += scanner.nextInt();
            System.out.println("Skaitļu summa ir " + number);
        }
        System.out.println("Gatavs!");

        // 2. uzdevums
        System.out.println("\n2. uzdevums");

        Scanner read = new Scanner(System.in);
        System.out.println("Ieraksti skaitli");
        int skaitlis = read.nextInt();
        boolean pirmskaitlis = false;
        for (int i = 2; i <= skaitlis / 2; ++i) {
            if (skaitlis % i == 0) {  // nosacījums priekš ne pirmskaitļa
                pirmskaitlis = true;
                break;
            }
        }
        if (skaitlis < 2) {
            System.out.println(skaitlis + " nav pirmskaitlis");
        } else if (!pirmskaitlis) {
            System.out.println(skaitlis + " ir pirmskaitlis.");
        } else {
            System.out.println(skaitlis + " nav pirmskaitlis.");
        }

        // 3. uzdevums
        System.out.println("\n3. uzdevums");

        // 4. uzdevums
        System.out.println("\n4. uzdevums");

        // 5. uzdevums
        System.out.println("\n5. uzdevums");

        // 6. uzdevums
        System.out.println("\n6. uzdevums");

    }
}
