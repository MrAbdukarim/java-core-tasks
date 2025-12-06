package uz.pdp.online.task.one;

public class Car {
    private String name;
    private String color;
    private String model;

    public Car(String name, String color, String model) {
        this.name = name;
        this.color = color;
        this.model = model;
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
