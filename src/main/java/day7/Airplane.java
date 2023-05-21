package day7;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public static void compareAirplanes(Airplane airplaneNumberOne, Airplane airplaneNumberTwo) {
        if (airplaneNumberOne.length > airplaneNumberTwo.length) System.out.println("Первый самолет длиннее");
        else if (airplaneNumberOne.length < airplaneNumberTwo.length) System.out.println("Второй самолет длиннее");
        else System.out.println("Длины самолетов равны");
    }
}
