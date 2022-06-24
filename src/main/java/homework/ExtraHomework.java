package homework;

import java.util.Random;
import java.util.Scanner;

public class ExtraHomework {
    public static void main(String[] args) {

        System.out.println("\nExtra homework.");
        Random random = new Random();
        int x = random.nextInt(50);
        int i = 1;

        Scanner scanner = new Scanner(System.in);
        while (i <= 10) {
            System.out.println("Uzmini skaitli");
            int enterNumber = scanner.nextInt();
            if (x == enterNumber) {
                System.out.println("Skaitlis uzminēts! Skaitlis bija: " + x + ". Minējumu skaits bija: " + i);
                break;
            } else if (i == 10 ) {
                System.out.println("Diemžēl skaitlis netika uzminēts 10 reizēs. Esiet zaudējis.");
                break;
            } else  {
                System.out.println("Skaitlis nav uzminēts. Mēģiniet uzminēt vēlreiz.");
                if (x > enterNumber) {
                    System.out.println("Ievadītais skaitlis bija zemāks par uzģenerēto skaitli.");
                } else {
                    System.out.println("Ievadītais skaitlis bija augstāks par uzģenerēto skaitli.");
                }
                i++;
            }
        }
    }

}
