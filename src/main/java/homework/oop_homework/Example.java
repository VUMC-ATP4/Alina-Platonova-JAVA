package homework.oop_homework;

import java.util.Date;

public class Example {

    public static void main (String[] args) {

        Customer customer1 = new Customer("Pēteris Ozols");
        customer1.setMember(true);
        customer1.setMemberType("Premium");

        Customer customer2 = new Customer("Liene Mākone");
        customer2.setMember(true);
        customer2.setMemberType("Gold");

        Customer customer3 = new Customer("Ilze Magone");
        customer3.setMember(true);
        customer3.setMemberType("Silver");

        Customer customer4 = new Customer("Jānis Liepiņš");
        customer4.setMember(false);


        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
        System.out.println(customer3.toString());
        System.out.println(customer4.toString());


        Visit v1 = new Visit(customer1, new Date());
        v1.setProductExpense(7.5);
        v1.setServiceExpense(31.0);
        System.out.println(v1);
        System.out.println("Klienta " + v1.getName() + " kopējie izdevumi = " + v1.getTotalExpense());

        Visit v2 = new Visit(customer2, new Date());
        v2.setProductExpense(14.0);
        v2.setServiceExpense(9.0);
        System.out.println(v2);
        System.out.println("Klienta " + v2.getName() + " kopējie izdevumi = " + v2.getTotalExpense());

        Visit v3 = new Visit(customer3, new Date());
        v3.setProductExpense(8.5);
        v3.setServiceExpense(8.0);
        System.out.println(v3);
        System.out.println("Klienta " + v3.getName() + " kopējie izdevumi = " + v3.getTotalExpense());

        Visit v4 = new Visit(customer4, new Date());
        v4.setProductExpense(5.5);
        v4.setServiceExpense(20.0);
        System.out.println(v4);
        System.out.println("Klienta " + v4.getName() + " kopējie izdevumi = " + v4.getTotalExpense());

    }
}
