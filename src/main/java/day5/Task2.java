package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Yamaha", "Blue", 2017);
        System.out.println(motorbike.getModel() + " " + motorbike.getColor() + " " + motorbike.getYearOfRelease());
    }
}
