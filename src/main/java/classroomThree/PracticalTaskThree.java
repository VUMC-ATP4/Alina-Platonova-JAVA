package classroomThree;

import java.util.Scanner;

public class PracticalTaskThree {

    public static void main(String[] args) {
        String[] gadalaiki = {"Ziema", "Pavasaris", "Vasara", "Rudens"};
        int[] fibonacciNumbers = {0, 1, 1, 2, 3, 5 , 8, 13, 21, 34};
        double[] randomNumbers = { 21.3, 323.24, 412.32};

        System.out.println("Masīva garums ir: " + gadalaiki.length);

        System.out.println(gadalaiki[0]);
        System.out.println(gadalaiki[1]);
        System.out.println(gadalaiki[2]);
        System.out.println(gadalaiki[3]);

        System.out.println(fibonacciNumbers[4]);
        System.out.println(randomNumbers[1]);

        //Nomainīt vērtību masīvā
        gadalaiki[2] = "Alīna";
        System.out.println(gadalaiki[2]);

        //Masīvs ar cilvēku vārdiem
        String[] cilveki = {"Juris", "Pēteris", "Anna"};
        int[] vecums = {33, 40, 28};
//        System.out.println("Vārds: " + cilveki[0] + "\n" + "Vecums: " + vecums[0]);
        printCilveks(cilveki, vecums, 1);

        //Masīvs ar vācu mašīnām
        String[] germanCars = new String[4];
        germanCars[0] = "Mercedes";
        germanCars[1] = "Audi";
        germanCars[2] = "BMW";
        germanCars[3] = "Opel";

        System.out.println(germanCars[3]);

        //Ievadi skaitli 1, ievadi skaitli 2, ievadi skaitli 3
//        int[] mansMasivs = generateArray();
//        System.out.println(mansMasivs[0] + "" + mansMasivs[1] + "" + mansMasivs[2]);

        //Cikls "while"
        int i = 0;
        while ( i < 5 ) {
            System.out.println("I ir : " + i);
            i = i + 1; // vai i++
        }
        System.out.println("Cikla izeja");

        //Cikls "while"
        int q = 10;
        while ( q > 1 ) {
            System.out.println("Q ir: " + q);
            q--; // vai q = q = 1
        }
        System.out.println("Cikla izeja");

        //Cikls "while" ar masīvu
        int[] bingoLottoLaimigieSkaitli = {3, 5, 48, 5 , 6, 31};
        int counter = 3;
        while ( counter < bingoLottoLaimigieSkaitli.length ) {
            System.out.println(bingoLottoLaimigieSkaitli[counter]);
            counter++;
        }
        System.out.println("Cikla izeja");

        //Izvadīt kārtis, kas man ir rokā
        String [] kartis = {"Pīķa dūzis", "Ercena kalps", "Kārava dāma"};
        int karts = 0;
        System.out.println(String.format("Man rokā ir %s kārtis ", kartis.length));
        while ( karts < kartis.length ) {
            System.out.println(kartis[karts]);
            karts++;
        }
        System.out.println("Cikla izeja");

        // Pozitīvo skaitļu summa. Ja ievadīs negatīvu skaitli, cikls atstāsies
        //sumPositiveNumbers();

        // Cikls ar "Do While". Salīdzināt ievadīto paroli ar paroli, kas atrodas DB
        Scanner scanner = new Scanner(System.in);
//        String parole = "Parole123";
//        String lietotajaParole;
//        do {
//            System.out.println("Ievadi paroli");
//            lietotajaParole = scanner.nextLine(); //Parole123
//            System.out.println("Pārbaudām paroli");
//        } while ( !lietotajaParole.equals(parole) );
//        System.out.println("Pareiza parole");

        // Cikls ar "Do While". Beidz darboties, kad ievada pozitīvu skaili
//        int number;
//        do {
//            System.out.println("Ievadi pozitīvu skaitli");
//            number = scanner.nextInt();
//        } while ( number < 0 );

        //
//        int number;
//        do {
//            System.out.println("Ievadi skaitli lielāku par 0, bet mazāku par 10");
//            number = scanner.nextInt();
//        } while ( number < 0 && number > 10 );

        //Cikls ar "For" (fori)
        for (int j = 2; j < 10; j= j + 2) {
            System.out.println(j);
        }

        //Cikls ar "For"
        for (int j = 0; j < gadalaiki.length; j++) {
            System.out.println(gadalaiki[j]);
        }

        //Cikls ar "For"
        for (int j = 0; j < 5; j++) {
            System.out.println("es esmu labs students");
        }

        // Šobrīd ciematā ir iespējams iegādāties mājas ar mājas numuriem no 1 līdz 50.
        // Pircējs vēlas iegādāties māju ciematā, bet viņš nevēlas māju, kuras numurs dalās
        // ar 3 vai 5.
        // Cik māju numuri atbilst prasībām?
        for (int j = 1; j <= 50; j++) {
            if ((j%3 == 0) || (j%5 == 0)) {
                System.out.println("Šie numuri mums neder: " + j);
            } else {
                System.out.println("Šie numuri mums der: " + j);
            }
        }

        // Izvada visus skaitļus no masīva
        int[] skaitli = {1,3,4,6,1,2,3,5,1,2,5};
        // for each
        for (int j:skaitli) {
            System.out.println(j);
        }

        // Izvada visus skaitļus no masīva
        int[] skaitlos = {1,3,4,6,1,2,3,5,1,2,5};
        int summa = 0;
        // for each
        for (int skaitlis : skaitlos) {
            summa = summa + skaitlis;
        }
        System.out.println(summa);

        // Izvada visus vārdus no masīva
        String[] vardi = {"ābols", "bumbieris", "burkāns"};
        for (String vards : vardi) {
            System.out.println(vards);
        }

        // Piemērs ar break. Neprintēs vairāk par 5.
        for (int j = 0; j < 10; j++) {
            if ( j == 5) {
                break;
            }
            System.out.println(j);
        }

        // Uzdevums. Meklēt tikai līdz skaitlim -3
        int[] skaitluMasivs = {1,2,3,4,5,6,7,2,3,4,5,6,-3,5,4};
        for (int j = 0; j < skaitluMasivs.length; j++) {
            if ( skaitluMasivs[j] == -3) {
                System.out.println(skaitluMasivs[j]);
                break; // izlec ārā no cikla
            }
            System.out.println(skaitluMasivs[j]);
        }

        //Piemērs ar continue
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        for (int j = 0; j <= 10; j++) {
            if ( j > 4 && j < 8 ) {  // ja nosacījums izpildās, cikls aiziet uz nākamo iterāciju
                continue;
            }
            System.out.println(j);
        }

    }

    //Masīvu izveide ar Scanner
    static int[] generateArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi pirmo skaitli...");
        int a = scanner.nextInt();
        System.out.println("Ievadi otro skaitli...");
        int b = scanner.nextInt();
        System.out.println("Ievadi trešo skaitli...");
        int c = scanner.nextInt();
        int[] skaitluMasivs = {a, b, c};
        return skaitluMasivs;
        //Var kodu saīsināt uz divām rindiņām, vienīgi neuzrādīsies teksts "Ievadi... skaitli..."
//            Scanner scanner = new Scanner(System.in);
//            return new int[]{scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

    }

    static void printCilveks(String[] humans, int[] ages, int index) {
        System.out.println("Vārds: " + humans[index] + "\n" + "Vecums: " + ages[index]);

    }

    // ar skeneri nolasīs vērtības
    //Pozitīvo skaitļu summa. Ja ievadīs negatīvu skaitli, cikls atstāsies
    static int sumPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ieraksti skaitli");
        int number = scanner.nextInt();
        int summa = 0;
        while ( number >= 0 ) {
            summa = summa + number;
            System.out.println("Ieraksti skaitli");
            number = scanner.nextInt();

        }
        System.out.println("Pozitīvo skaitļu summa ir " + summa);
        return summa;
    }

    // Cikls ar "Do While"

}
