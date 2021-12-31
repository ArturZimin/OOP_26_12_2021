package by.zimin.employee;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


        IdCard id1 = new IdCard(23442556, new Date(10_10_1987));
        Room r1 = new Room(12);
        Department d1 = new Department("Deliver");
        PastPosition pp1 = new PastPosition("Electric", d1);
        Employee e1 = new Employee("Dima", "Mishkin", "Driver", id1, r1, d1, pp1);

        IdCard id2 = new IdCard(234545567, new Date(6_10_1981));
        Room r2 = new Room(16);
        Department d2 = new Department("Manager");
        PastPosition pp2 = new PastPosition("Shop assistant", d2);
        Employee e2 = new Employee("Olga", "Minaeva", "Manager", id2, r2, d2, pp2);

        IdCard id3 = new IdCard(232345567, new Date(18_05_1992));
        Room r3 = new Room(19);
        Department d3 = new Department("Marketing");
        PastPosition pp3 = new PastPosition("Architect", d3);
        Employee e3 = new Employee("Irina", "Baeva", "Architect", id3, r3, d3, pp3);

        IdCard id4 = new IdCard(343245567, new Date(2_03_1999));
        Room r4 = new Room(9);
        Department d4 = new Department("Human Resources Department");
        PastPosition pp4 = new PastPosition("Chief", d4);
        Employee e4 = new Employee("Ekaterina", "Dubkova", "Chief", id4, r4, d4, pp4);

        IdCard id5 = new IdCard(321212567, new Date((10_12_1223)));
        Room r5 = new Room(4);
        Department d5 = new Department("Technical");
        PastPosition pp5 = new PastPosition("Engineer", d5);
        Employee e5 = new Employee("Artur", "Zimin", "Engineer", id5, r5, d5, pp5);

        showEmployees(e1);
        showEmployees(e2);
        showEmployees(e3);
        showEmployees(e4);
        showEmployees(e5);


    }

    public static void showEmployees(Employee employee) {
        System.out.println("=============================================");
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getCard().getNumber());
        System.out.println(employee.getCard().getDateExpire());
        System.out.println(employee.getDepartment().getName());
        System.out.println(employee.getPosition());
        System.out.println("=============================================");


    }
}
