package classroomFour;

public class Automasina {
    String marka;
    int izlaidumaGads;
    String krasa;
    String degvielasVeids;
    double motoraTilpums;
    String atrumkarbasVeids;
    int atrumi;
    int nobraukums;
    String nobraukumaMervieniba;
    boolean irTehniskaIzieta;

    public void printetAuto() {
        System.out.println("Automašīna marka: " + marka);
        System.out.println("Automašīnas izlaiduma gads ir " + izlaidumaGads);
        System.out.println("Automašīnas krāsa ir " + krasa);
        System.out.println("Automašīnas degvielas veids ir " + degvielasVeids + " un motora tilpums ir " + motoraTilpums);
        System.out.println("Automašīnas ātrumkārbas veids ir " + atrumkarbasVeids + " un automašīnai ir " + atrumi + " ātrumi");
        System.out.println("Automašīnas nobraukums ir " + nobraukums + nobraukumaMervieniba);
        System.out.println("Vai automašīnai ir izieta tehniskā apskate? " + irTehniskaIzieta);
    }
}
