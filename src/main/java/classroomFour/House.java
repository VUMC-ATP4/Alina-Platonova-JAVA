package classroomFour;

public class House {
    String ielasNosaukums;
    int majasNumurs;
    int stavuSkaits;
    int ieejuSkaits;
    int istabuSkaits;
    double platiba;
    int cena;
    char valuta;

    boolean irStavvieta;

    public void printetAdresi() {
        System.out.println("Mājas adrese ir: " + ielasNosaukums + " " + majasNumurs);
    }

    public void printetPapildusInfo() {
        System.out.println("Mājai ir " + stavuSkaits + " stāvi");
        System.out.println("Mājai ir " + ieejuSkaits + " ieejas");
        System.out.println("Mājai ir " + istabuSkaits + " istabas");
        System.out.println("Mājas platība ir: " + platiba);
        System.out.println("Mājas cena ir " + cena + valuta);
        System.out.println("Vai mājai ir stāvvieta? : " + irStavvieta);
        System.out.println("Cena kvadrātmetrā ir " + cena/platiba + valuta);
    }

    public double cenaKvadratmetra() {
        return cena/platiba;
    }


}

