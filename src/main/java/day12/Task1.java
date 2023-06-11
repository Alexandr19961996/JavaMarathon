package day12;

import java.util.List;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Chevrolet");
        cars.add("Audi");
        cars.add("Bentley");
        cars.add("BMW");
        cars.add("FORD");
        System.out.println(cars);

        cars.add(2, "Lamborghini");
        cars.remove(0);
        System.out.println(cars);
    }
}
