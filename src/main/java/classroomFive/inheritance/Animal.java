package classroomFive.inheritance;

public class Animal {

    int legCount;
    String name;

    // konstruktors
    public Animal(int legCount, String name) {
        this.legCount = legCount;
        this.name = name;
    }

    public void printLegCount() {
        System.out.println("Vārds: " + name +". Kāju skaits ir: " + legCount);
    }

    public void makeSound() {
        System.out.println("Es esmu dzīvnieks. Arghhhh...");
    }
}
