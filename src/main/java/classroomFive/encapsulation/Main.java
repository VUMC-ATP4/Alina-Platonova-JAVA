package classroomFive.encapsulation;

public class Main {
    public static void main(String[] args) {
        Bird putns = new Bird();
        putns.color = "Zila";
        //System.out.println(putns.name); nevar izmantot, piekļūt un izmainīt ārpus klases, jo private
        putns.printText();
        // putns.printTextSpecial(); nevar izsaukt, jo private metode
        putns.defaultMethodExample();

        Human cilveks = new Human();
        cilveks.setAge(-1);
        System.out.println(cilveks.getAge());
        cilveks.setName("Max");
        System.out.println(cilveks.getName());
        cilveks.setSurname("Webber");
        System.out.println(cilveks.getSurname());
        cilveks.setHeight(183.5);
        System.out.println(cilveks.getHeight());

        // statiskais polimorfisms piemērs (method overload)
        Matematika matematika = new Matematika();
        System.out.println(matematika.add(30, 20));
        System.out.println(matematika.add(1.3,3.5));
        matematika.paraditTekstu("Alīna");
        matematika.paraditTekstu("Alīna", false);
        matematika.paraditTekstu("Kārlis", true);
    }

}
