package day6;

public class Car {
    private String model;
    private String color;
    private int year;

    public void setYear(int year) {
        this.year = year;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        return (Math.abs(inputYear - year));
    }
}
