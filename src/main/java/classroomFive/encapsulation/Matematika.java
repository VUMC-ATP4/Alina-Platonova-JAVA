package classroomFive.encapsulation;

public class Matematika {

    //statiskais polimorfisms (overloading)
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public void paraditTekstu(String a) {
        System.out.println("Teksts ir: " + a);
    }

    public void paraditTekstu(String a, boolean isMan) {
        if (isMan == true) {
            System.out.println("Mr: " + a);
        } else {
            System.out.println("Ms: " + a);
        }
    }


}
