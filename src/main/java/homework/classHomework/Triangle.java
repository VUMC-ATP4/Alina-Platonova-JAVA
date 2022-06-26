package homework.classHomework;

public class Triangle {

    int a, b, c;

    Triangle() {
        System.out.println("Veidoju trijstūri");
    }

    Triangle (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double pusPerimetrs() {
        return (a + b + c) / 2.0;
    }

    public double laukums() {
        double p = pusPerimetrs();
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public boolean vaiTrijsturisVienadmalu() {
        if ((a == b) && (b == c) && (c == a)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean vaiTrijsturisVienadsanu() {
        if ((a == b && b != c) || (a != b && c == a) || (c == b && c != a)) {
            return true;
        } else {
            return false;
        }
    }

    public void printetRezultatu() {
        System.out.println("Trijstūra laukums: " + String.format("%.2f", laukums()) + " cm^2");
        System.out.println("Vai trijstūris ir vienādmalu? " + vaiTrijsturisVienadmalu());
        System.out.println("Vai trijstūris ir vienādsānu? " + vaiTrijsturisVienadsanu());
    }
}
