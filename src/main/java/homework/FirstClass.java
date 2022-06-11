package homework;

public class FirstClass {
    public static void main(String[] args) {

        System.out.println("\nTHIS IS HOMEWORK");

        // Valsts apraksts
        String country = "Somija";
        double population = 5.531;
        String populationAbbreviation = "milj.";
        double area = 38.455;
        String areaAbbreviation = "km^2";
        String countryCapital = "Helsinki";
        String firstOfficialLanguage = "somu";
        String secondOfficialLanguage = "zviedru";
        boolean isEUMemberCountry = true;
        int memberCountryYear = 1995;
        char countryCurrency = '€';

        System.out.println("\nValsts nosaukums: " + country);
        System.out.println("Iedzīvotāju skaits: " + population + " " + populationAbbreviation);
        System.out.println("Valsts platība: " + area + " " + areaAbbreviation);
        System.out.println("Somijas galvaspilsēta: " + countryCapital);
        System.out.println("Officiālās valodas: " + firstOfficialLanguage + " un " + secondOfficialLanguage);
        System.out.println("Vai Somija ir ES dalībvalsts? " + isEUMemberCountry);
        System.out.println("Kopš kura gada Somija ir ES dalībvalsts? " + memberCountryYear);
        System.out.println("Valsts valūta: " + countryCurrency);

        // Konkatenācija un formāts
        String konkatenacija = "\nIzvēlētā valsts ir " + country + ", kuras platība ir " + area + " " + areaAbbreviation + ". Somijas galvaspilsēta ir " + countryCapital + ". Somijā ir 2 oficiālās valodas: " + firstOfficialLanguage + " un " + secondOfficialLanguage + ".";
        System.out.println(konkatenacija);
        String formats = String.format("\nIzvēlētā valsts ir %s, kuras platība ir %s %s. Somijas galvaspilsēta ir %s. Somijā ir 2 oficiālās valodas: %s un %s.",country,area,areaAbbreviation,countryCapital,firstOfficialLanguage,secondOfficialLanguage);
        System.out.println(formats);

        // Aritmētiskās darbības

        int a = 14;
        int b = 6;
        int c = 2;
        int d = 10;
        int e = 5;

        System.out.println("\nSaskaitīšana");
        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(b + " + " + c + " = " + (b+c));
        System.out.println(c + " + " + d + " = " + (c+d));

        System.out.println("\nAtņemšana");
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(b + " - " + c + " = " + (b-c));
        System.out.println(a + " - " + d + " = " + (a-d));

        System.out.println("\nReizināšana");
        System.out.println(a + " * " + c + " = " + (a*c));
        System.out.println(b + " * " + d + " = " + (b*d));
        System.out.println(a + " * " + d + " = " + (a*d));

        System.out.println("\nDalīšana");
        System.out.println(a + " / " + c + " = " + (a/c));
        System.out.println(b + " / " + c + " = " + (b/c));
        System.out.println(d + " / " + c + " = " + (d/c));

        System.out.println("\nAtlikums");
        System.out.println(a + " % " + e + " = " + (a%e));
        System.out.println(b + " % " + e + " = " + (b%e));
        System.out.println(c + " % " + e + " = " + (c%e));

    }
}
