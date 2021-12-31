package by.zimin.car;

import java.util.Objects;

public class Car {
    private String name;
    private String model;
    private Color color;
    private int productionYear;
    private int accelerationTimeTo100Km;
    private int weight;

    public Car(String name, String model, Color color, int productionYear, int accelerationTimeTo100Km, int weight) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
        this.accelerationTimeTo100Km = accelerationTimeTo100Km;
        this.weight = weight;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getAccelerationTimeTo100Km() {
        return accelerationTimeTo100Km;
    }

    public void setAccelerationTimeTo100Km(int accelerationTimeTo100Km) {
        this.accelerationTimeTo100Km = accelerationTimeTo100Km;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return productionYear == car.productionYear && accelerationTimeTo100Km == car.accelerationTimeTo100Km && weight == car.weight && Objects.equals(name, car.name) && Objects.equals(model, car.model) && color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, color, productionYear, accelerationTimeTo100Km, weight);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", color=" + color +
                ", productionYear=" + productionYear +
                ", accelerationTimeTo100Km=" + accelerationTimeTo100Km +
                ", weight=" + weight +
                '}';
    }

    public void showPropertiesCar(Car car) {

        System.out.println("==================================================");

        System.out.println("Car name: " + car.getName());
        System.out.println("Color: " + car.getColor());
        System.out.println("Model: " + car.getModel());
        System.out.println("Acceleration time to 100 km/h: " + car.getAccelerationTimeTo100Km());
        System.out.println("Production year: " + car.getProductionYear());
        System.out.println("Weight: " + car.getWeight());

        System.out.println("==================================================");

    }
}
