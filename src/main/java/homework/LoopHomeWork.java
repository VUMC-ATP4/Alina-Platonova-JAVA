package homework;

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
        int[] masivsViens = {1,3,5};
        String[] masivsDivi  = {"sarkans", "zaļš", "balts"};
        char[] masivsTris = {'a', 'b', 'c'};

        // while
        int vertiba1 = 0;
        System.out.println("Pirmā masīva vērtības, izmantojot while ciklu");
        while ( vertiba1 < masivsViens.length ) {
            System.out.println(masivsViens[vertiba1]);
            vertiba1++;
        }

        int vertiba2 = 0;
        System.out.println("\nOtrā masīva vērtības, izmantojot while ciklu");
        while ( vertiba2 < masivsDivi.length ) {
            System.out.println(masivsDivi[vertiba2]);
            vertiba2++;
        }

        int vertiba3 = 0;
        System.out.println("\nTrešā masīva vērtības, izmantojot while ciklu");
        while ( vertiba3 < masivsTris.length ) {
            System.out.println(masivsTris[vertiba3]);
            vertiba3++;
        }

        // do while
        int vertiba4 = 0;
        System.out.println("------------------------------");
        System.out.println("Pirmā masīva vērtības, izmantojot do while ciklu");
        do {
            System.out.println(masivsViens[vertiba4]);
            vertiba4++;
        } while (vertiba4 < masivsViens.length);

        int vertiba5 = 0;
        System.out.println("\nOtrā masīva vērtības, izmantojot do while ciklu");
        do {
            System.out.println(masivsDivi[vertiba5]);
            vertiba5++;
        } while (vertiba5 < masivsDivi.length);

        int vertiba6 = 0;
        System.out.println("\nTrešā masīva vērtības, izmantojot do while ciklu");
        do {
            System.out.println(masivsTris[vertiba6]);
            vertiba6++;
        } while (vertiba6 < masivsTris.length);

        // for loop
        System.out.println("------------------------------");
        System.out.println("Pirmā masīva vērtības, izmantojot for loop ciklu");
        for (int vertiba7 = 0; vertiba7 < masivsViens.length; vertiba7++) {
            System.out.println(masivsViens[vertiba7]);
        }

        System.out.println("\nOtrā masīva vērtības, izmantojot for loop ciklu");
        for (int vertiba8 = 0; vertiba8 < masivsDivi.length; vertiba8++) {
            System.out.println(masivsDivi[vertiba8]);
        }

        System.out.println("\nTrešā masīva vērtības, izmantojot for loop ciklu");
        for (int vertiba9 = 0; vertiba9 < masivsTris.length; vertiba9++) {
            System.out.println(masivsTris[vertiba9]);
        }

        // for each
        System.out.println("------------------------------");
        System.out.println("Pirmā masīva vērtības, izmantojot for each ciklu");
        for (int vertiba10:masivsViens) {
            System.out.println(vertiba10);
        }

        System.out.println("\nOtrā masīva vērtības, izmantojot for each ciklu");
        for (String vertiba11:masivsDivi) {
            System.out.println(vertiba11);
        }

        System.out.println("\nTrešā masīva vērtības, izmantojot for each ciklu");
        for (char vertiba12:masivsTris) {
            System.out.println(vertiba12);
        }

        // 4. uzdevums
        System.out.println("\n4. uzdevums");
        int[] masivs = new int[100];
        for (int j = 0; j <= masivs.length; j = j + 2) {
            System.out.print(j + ", ");
        }

        // 5. uzdevums
        System.out.println("\n\n5. uzdevums");
        faktorials();

        // 6. uzdevums
        System.out.println("\n6. uzdevums");
        pin();

    }

    // Metodes
    static void faktorials() {

        int skaitlis;
        int rezultats = 1;
        int i;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi skaitli");
        skaitlis = scanner.nextInt();
        for (i = 1; i <= skaitlis; i++) {
            rezultats = rezultats * i;
        }
        System.out.println("Faktoriālā vērtība ir: " + rezultats);
    }

    static void pin() {

        final int pinKods = 7182;
        int i = 1;

        Scanner skeneris = new Scanner(System.in);
        while ( i <= 3) {
            System.out.println("Ievadiet PIN kodu");
            int enterPin = skeneris.nextInt();
            if (pinKods == enterPin) {
                System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ.");
                break;
            } else if ( i == 3) {
                System.out.println("Atvainojiet, bet jūs esat bloķēts.");
                break;
            } else {
                System.out.println("Nepareizs PIN, mēģiniet vēlreiz.");
                i++;
            }
        }
    }
}
