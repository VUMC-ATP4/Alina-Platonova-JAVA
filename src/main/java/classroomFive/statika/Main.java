package classroomFive.statika;

public class Main {
    public static void main(String[] args) {
        Car auto1 = new Car("BMW", "melns");
        System.out.println("Auto skaits sistēmā: " + auto1.countOfCarsCreatedInSystem);
        System.out.println("Auto skaits sistēmā: " + Car.countOfCarsCreatedInSystem);  // var rakstīt arī šādi

        Car auto2 = new Car("Mercedes", "balts");
        System.out.println("Auto skaits sistēmā: " + auto1.countOfCarsCreatedInSystem);


        auto1.klasesApraksts = ". Šī ir auto klase";
        System.out.println("auto1: " + auto1.getColor() + " " + auto1.getName() + auto1.klasesApraksts);
        System.out.println("auto2: " + auto2.getColor() + " " + auto2.getName() + auto2.klasesApraksts);

        auto2.klasesApraksts = ". Šī ir auto klase XXXXXXXXXX";
        System.out.println("auto1: " + auto1.getColor() + " " + auto1.getName() + auto1.klasesApraksts);
        System.out.println("auto2: " + auto2.getColor() + " " + auto2.getName() + auto2.klasesApraksts);

        Car.makeSound();
        auto1.makeSound();
        auto2.makeSound();

    }
}
