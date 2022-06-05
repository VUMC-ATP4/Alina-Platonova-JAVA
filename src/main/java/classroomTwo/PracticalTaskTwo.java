package classroomTwo;

import java.util.Scanner;

public class PracticalTaskTwo {

    public static void main(String[] args) {

        System.out.println("Šī ir otrā Java lekcija");
        String teksts;
        String name = "Alīna";
        teksts = String.format("Mani sauc %s", name);
        System.out.println(teksts);


        double a = 100.25;
        int b = 10;

        //System.out.println("a-b = " + (b / a));
        System.out.println(String.format("%.2f",(b / a)));

        String vards = "Alīna";
        String surname = "Platonova";
        String role = "Students";
        double videjaAtzime = 7.3214;

        // Viens cipars aiz komata ir %.1f
        String teikums = String.format("Mani sauc %s. Mans uzvārds ir %s. Es esmu %s. Mana vidējā atzīme ir %.1f", vards,surname,role, videjaAtzime);
        String concatTeikums = "Mani sauc " + vards + " Mans uzvārds ir " + surname + " Es esmu " + role;

        System.out.println(teikums);
        System.out.println(concatTeikums);

        // Izmanto, lai ievadītu pats savas vērtības
        // tips nosaukums deklaracija
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Ievadi savu vārdu");
//        String userName = scanner.nextLine();
//        System.out.println(String.format("Labdien %s! Esi sveicināta mūsu kalkulatora programmā!", userName));
//
//        int c;
//        int d;
//        int summa;
//
//        System.out.println("\nIevadi skaitli c");
//        c = scanner.nextInt();
//        System.out.println("Ievadi skaitli d");
//        d = scanner.nextInt();
//        summa = c + d;
//        System.out.println(String.format("%s, %s + %s = %s", userName, c, d, summa));
//        System.out.println(c > d);

        System.out.println("\nCits piemērs");
        System.out.println(6!=5); // true
        System.out.println(5!=5); // false

        System.out.println("\nCits piemērs");
        int vecums = 18;
        System.out.println(vecums >= 18);
        int bernuVecums = 5;
        System.out.println(bernuVecums<=5);
        boolean isLegitToVote = vecums >= 18;
        System.out.println("Vai cilvēks drīkst balsot ? " + isLegitToVote);

        System.out.println("\nVai vārdi sakrīt?");
        String nameOne = "Alīna";
        String nameTwo = "Alīna";
        System.out.println(nameOne.equals(nameTwo));

        // LOĢISKIE OPERATORI
        System.out.println("\nLoģiskie operatori");
        //System.out.println("Ievadi X");
        //int x = scanner.nextInt();
        int x = 4;
        boolean vaiIrPatiess = (x < 5 && x < 10); // false
        x = 5;
        System.out.println((x < 5 && x <10)); // true
        System.out.println((x < 5 || x <10)); // true
        System.out.println(vaiIrPatiess);

        //SAZAROJUMI
        // if - then
        int age;
        boolean canVote = false;

        System.out.println("\nPaskaties cilvēka pasē");
        age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Drīkst balsot");
            canVote = true;
        }
        System.out.println("Vai drīkst balsot? " + canVote);

        int n = 10;
        int m = 20;
        if (m > n && n > 5) {
            System.out.println("m ir lielāks par n un lielāks par 5");
        }

        // if - else (Ja)
        int skaitlis = 5;
        if (skaitlis > 0) {
            System.out.println(skaitlis + " ir pozitīvs!");
        } else {
            System.out.println(skaitlis + " ir negatīvs!");
        }

        // Piemērs 2
        int ageTwo;
        System.out.println("\nPaskaties cilvēka pasē?");

        ageTwo = scanner.nextInt();
        if (ageTwo >= 18) {
            System.out.println("Drikst balsot");
        } else {
            System.out.println("Nedrīkst balsot");
        }

        // If - else - if (Ja)
        int number = 5;
        if (number > 0) {
            System.out.println(number + " ir pozitivs!");
        } else if (number < 0) {
            System.out.println(number + " ir negativs!");
        } else {
            System.out.println(number + " ir NULLE!");
        }

        //Piemērs 2
        int numberTwo = 30;
        if (numberTwo == 10) {
            System.out.println("\nSkaitlis ir 10");
        } else if (numberTwo == 15) {
            System.out.println("\nSkaitlis ir 15");
        } else if (numberTwo == 20) {
            System.out.println("\nSkaitlis ir 20");
        } else {
            System.out.println("\nSkaitlis ir nezināms");
        }

        // Switch (case - gadījumi). Izmanto, ja ir zināmi konkrēti gadījumi.
        int month = 2;

        switch (month) {
            case 1:
                System.out.println("\nJanvāris");
                break;
            case 2:
                System.out.println("\nFebruāris");
                break;
            case 12:
                System.out.println("\nDecembris");
            default:
                System.out.println("\nMēnesis " + month + " nav definēts");
        }

        // Uzdevums 1
        int q = 10;
        if (q > 0) {
            System.out.println("\nSkaitlis ir lielāks par nulli");
        }

        // Uzdevums 2 - Pensija
        int cilvekaVecums = 65;
        char dzimums = 'V';
        boolean drikstDoties = false;

        if (cilvekaVecums >=65 && dzimums == 'V') {
            drikstDoties = true;
        } else if (cilvekaVecums >=60 && dzimums == 'S') {
            drikstDoties = true;
        }

        System.out.println("\nCilvēks drīkst doties pensijā " + drikstDoties);

        // Uzdevums 3
        int diena = 7;
        switch (diena) {
            case 1:
                System.out.println("Pirmdiena");
                break;
            case 2:
                System.out.println("Otrdiena");
            default:
                System.out.println("\nDiena " + diena + " nav definēta");

        }

        // Uzdevums 4
        // 12 % 2 = 0, jo nav atlikuma
        // 13 % 2 = 1, jo ir atlikums
        // 15 % 2 = 1, jo ir atlikums

        int skaitlisX = 15;
        if (skaitlisX % 2 == 0) {
            System.out.println("Skaitlis ir pāra");
        } else {
            System.out.println("Skaitlis ir nepāra");
        }



    }
}
