package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Chevrolet");
        car.setColor("Black");
        car.setYearOfRelease(2017);
        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getYearOfRelease());
    }
}
