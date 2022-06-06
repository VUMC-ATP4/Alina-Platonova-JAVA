package classroomFour;

public class Main {

    public static void main(String[] args) {
        // objekts viens
        House majaViens = new House();
        majaViens.majasNumurs = 1;
        majaViens.ielasNosaukums = "Brīvības iela";
        majaViens.printetAdresi();

        // objekts divi
        House majaDivi = new House();
        majaDivi.majasNumurs = 2;
        majaDivi.ielasNosaukums = "Tallinas iela";
        majaDivi.printetAdresi();
        System.out.println("----------------------------------");

        // objektam divi nomainās nosaukums
        majaDivi.ielasNosaukums = "Izmainīts nosaukums";
        majaDivi.printetAdresi();
        System.out.println("----------------------------------");

        // objekts trīs
        House majaTris = new House();
        majaTris.majasNumurs = 3;
        majaTris.ielasNosaukums = "Ģertrūdes iela";
        majaTris.stavuSkaits = 5;
        majaTris.ieejuSkaits = 3;
        majaTris.istabuSkaits = 2;
        majaTris.platiba = 54.3;
        majaTris.cena = 60000;
        majaTris.valuta = '$';
        majaTris.irStavvieta = true;
        majaTris.printetAdresi();
        majaTris.printetPapildusInfo();
        System.out.println("----------------------------------");

        Velosipeds veloViens = new Velosipeds();
        System.out.println(veloViens.atrumi);
        System.out.println(veloViens.nosaukums);
        // nomainam default ātrumu
        veloViens.atrumi = 28;
        System.out.println(veloViens.atrumi);
        veloViens.spiedPedalus();
        System.out.println("Velosipēda ātrums ir: " + veloViens.atrums);
        veloViens.spiedPedalus();
        veloViens.spiedPedalus();
        veloViens.spiedPedalus();
        veloViens.spiedPedalus();
        System.out.println("Velosipēda ātrums ir: " + veloViens.atrums);
        System.out.println("Priekšā ir gājējs!");
        veloViens.bremzet();
        veloViens.bremzet();
        veloViens.bremzet();
        veloViens.bremzet();
        veloViens.bremzet();
        System.out.println("Velosipēda ātrums ir: " + veloViens.atrums);
        System.out.println("----------------------------------");

        // otra velosipēda ātrums
        Velosipeds veloDivi = new Velosipeds();
        veloDivi.atrums = 18;
        veloDivi.bremzuTips = "V-veida";
        System.out.println(veloDivi.atrums);
        System.out.println("Velosipēda ātrums ir: " + veloDivi.atrums);
        System.out.println("Priekšā ir gājējs!");
        veloDivi.bremzet();
        System.out.println("Velosipēda ātrums ir: " + veloDivi.atrums);
        System.out.println("----------------------------------");

        // automašīna
        Automasina autoTest = new Automasina();
        autoTest.marka = "Audi";
        autoTest.izlaidumaGads = 2010;
        autoTest.krasa = "balta";
        autoTest.degvielasVeids = "dīzelis";
        autoTest.motoraTilpums = 3.0;
        autoTest.atrumkarbasVeids = "automāts";
        autoTest.atrumi = 6;
        autoTest.nobraukums = 391812;
        autoTest.nobraukumaMervieniba = "km";
        autoTest.irTehniskaIzieta = true;
        autoTest.printetAuto();
        System.out.println("----------------------------------");

        // Riņķa laukuma aprēķins
        Rinkis rinkis1 = new Rinkis(5.34);
        //Rinkis rinkis1 = new Rinkis();
        Rinkis rinkis2 = new Rinkis();

        //rinkis1.radiuss = 5.34;
        rinkis2.radiuss = 15.30;

        System.out.println(rinkis1.rinkaLaukums());
        System.out.println(rinkis2.rinkaLaukums());
        System.out.println("----------------------------------");

        // Riņķa diametrs
        System.out.println(rinkis1.diametrs());
        System.out.println(rinkis2.diametrs());
        System.out.println("----------------------------------");

    }

}
