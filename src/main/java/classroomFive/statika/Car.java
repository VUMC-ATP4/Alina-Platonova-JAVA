package classroomFive.statika;

public class Car {
    // encapsulation
    private String name;
    private String color;
    public static String klasesApraksts = "Šī ir mašīnas klase";
    public static int countOfCarsCreatedInSystem;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
        countOfCarsCreatedInSystem++;
    }

    public static void makeSound() {
        System.out.println("Honk honk");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
