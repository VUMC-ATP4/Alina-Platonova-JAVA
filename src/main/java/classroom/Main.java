package classroom;

public class Main {
    static int timeout = 10;

    public static void main(String[] args) {
        System.out.println("Mācāmies mainīgos");
        System.out.println(timeout);

        int x = 5;
        int y = 8;

        System.out.println("x ir vienāds ar:");
        System.out.println(x);
        System.out.println("y ir vienāds ar:");
        System.out.println(y);
        System.out.println("x+y ir vienāds ar");
        System.out.println(x+y);

        double lowestTemperature = -20.4;
        float highestTemperature = 40.65512312F;
        System.out.println("Augstaka temp ir " + highestTemperature + "zemaka temp ir " + lowestTemperature);

        // Vārdi un teikumi JAVA valodā tiek saglabāti mainīgā tipā String
        String dogName = "Naila";
        int dogAge = 7;
        double dogWeight = 14.7;
        String dogBreed = "Welsh Corgi";
        boolean isDogHungry = true;
        char dogGender = 'F';
        char dogCurrency = '$';
        double puppyPrice = 1600;


        System.out.println("\nManu suni sauc " + dogName);
        System.out.println(dogName + " ir " + dogAge + " gadus veca");
        System.out.println(dogName + " sver " + dogWeight + " kg");
        System.out.println(dogName + " ir " + dogBreed);
        System.out.println("Vai suns ir izsalcis? : " + isDogHungry);
        System.out.println("Suņa dzimums: " + dogGender);
        System.out.println("Suņa kucēni maksā: " + puppyPrice +" " + dogCurrency);

        byte age = 10;
        short deepestSeaLevel = 11000;
        int highestIntNumber = 2147483647;
        long USACountryDebt = 21474836471232L;
        System.out.println(age);
        System.out.println(deepestSeaLevel);
        System.out.println(highestIntNumber);
        System.out.println(USACountryDebt);


        int summa;
        int pirmaisSkaitlis = 10;
        int otraisSkaitlis = -8;

        summa = pirmaisSkaitlis + otraisSkaitlis;
        System.out.println(pirmaisSkaitlis + " + " + otraisSkaitlis + " = " + summa);

        double a = 3.5;
        int b = 5;
        System.out.println((double) b);
        System.out.println((int) a);


        int c = 7;

        System.out.println("########"+b/a);





    }
}
