package by.zimin.person;

public class Main {

    public static void main(String[] args) {


        Person person1 = new Person("Aleksey", SkinColor.WHITE, Gender.MALE);
        Person person2 = new Person("Anna", SkinColor.BLACK, Gender.FEMALE);

        System.out.println(person1.getName());
        System.out.println(person2.getName());


    }
}
