package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplaneNumberOne = new Airplane("Boeing", 2015, 60, 183500);
        Airplane airplaneNumberTwo = new Airplane("Airbus", 2017, 75, 196500);
        Airplane.compareAirplanes(airplaneNumberOne, airplaneNumberTwo);
    }
}