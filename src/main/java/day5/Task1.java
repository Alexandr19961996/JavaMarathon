package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.SetModel("Chevrolet");
        car.SetColor("Black");
        car.SetYearOfRelease(2017);
        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getYearOfRelease());
    }
}
