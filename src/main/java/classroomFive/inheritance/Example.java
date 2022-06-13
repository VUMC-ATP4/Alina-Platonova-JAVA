package classroomFive.inheritance;

public class Example {
    public static void main(String[] args) {
        Dog dog1 = new Dog(4, "Reksis");
        Animal dog2 = new Dog(4, "Lesija"); //dog manto no animal

        Octopus octopus1 = new Octopus(8, "Aštons");
        Chicken chicken1 = new Chicken(2, "Bils");
        Chicken chicken2 = new Chicken(1, "Vils");  //cieta uzbrukumā :D

        dog1.printLegCount();
        octopus1.printLegCount();
        chicken1.printLegCount();
        chicken2.printLegCount();

        System.out.println(octopus1.waterType);
        octopus1.printWaterType();

        Fox lapsa = new Fox("Kūmiņš", 4);
        Animal dzivnieks = new Animal(1, "Dzīvnieks");

        int[]ieluNumri = {1,2,3,4,5,6};
        Animal [] dzivnieki = {dog1, octopus1, chicken1, chicken2, dzivnieks};

        for (int i = 0; i <dzivnieki.length; i++) {
            dzivnieki[i].printLegCount();
        }

        // method overwrite (dinamiskais polimorfisms)
        dog1.makeSound();
        chicken1.makeSound();
        octopus1.makeSound();
    }
}
