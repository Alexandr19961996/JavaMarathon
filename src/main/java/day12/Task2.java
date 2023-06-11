package day12;

import java.util.List;
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> evenNumbers = new ArrayList<>();
        add(0, 30, evenNumbers);
        add(300, 350, evenNumbers);
        System.out.println(evenNumbers);
    }

    public static void add(int start, int end, List<Integer> list) {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
    }
}
