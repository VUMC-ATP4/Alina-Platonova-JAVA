package classroomTwo;

public class Metodes {
    public static void main(String[] args) {
        System.out.println("Sākās koda izpilde");
        printText();
        System.out.println("Beidzās koda izpilde");

        int a =10;
        int b = 50;
        int laukums =  calculateArea(a,b);
        System.out.println(laukums);

        //Neizvadīs summu bez sout
        sum(5, 3, 10);
        System.out.println(sum(5, 3, 10));
    }

    static int calculateArea(int a, int b){
        return a*b;
    }


    static void printText() {
        System.out.println("Šīs ir manas metodes sākums");
        System.out.println("Es izsaucu šo metodi - beigas");
    }

    //Metode, kas pieņem 3 veselus skaitļus un atgriež šo skaitļu summu
    static int sum(int a, int b, int c) {
        return a + b + c;
    }


}
