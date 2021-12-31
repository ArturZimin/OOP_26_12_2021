package by.zimin.car;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Bmw", "6", Color.BLACK, 2020, 7, 2000);
        Car car2 = new Car("MB", "ML", Color.WHITE, 2021, 8, 2700);
        Car car3 = new Car("Opel", "Corsa", Color.RED, 2019, 13, 1600);


        car1.showPropertiesCar(car2);
        car1.showPropertiesCar(car1);
        car1.showPropertiesCar(car3);




    }

}
