package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.info();
        car.setYear(2020);
        System.out.println(car.yearDifference(2010));
        Motorbike motorbike = new Motorbike("Yamaha", "Blue", 2017);
        motorbike.info();
        System.out.println(motorbike.yearDifference(2010));
    }
}
