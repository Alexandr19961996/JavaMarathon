package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2015, 60, 183500);
        airplane.setYear(2020);
        airplane.setLength(70);
        airplane.fillUp(1000);
        airplane.fillUp(2000);
        airplane.info();
    }
}
