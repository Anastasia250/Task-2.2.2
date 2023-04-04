package web.config;

public class Car {
    private final String brand;
    private final String color;
    private final int power;

    public Car(String brand, String color, int power) {
        this.brand = brand;
        this.color = color;
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getPower() {
        return power;
    }
}
