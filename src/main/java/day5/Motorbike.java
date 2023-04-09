package day5;

public class Motorbike {
    private String model;
    private String color;
    private int yearOfRelease;

    public Motorbike(String model, String color, int yearOfRelease) {
        this.model = model;
        this.color = color;
        this.yearOfRelease = yearOfRelease;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }
}
