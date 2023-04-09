package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int [] mass = new int [100];
        Random rand = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(1000);
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int countNumbersHasOnEndZero = 0;
        int sumNumbersHasOnEndZero = 0;
        for (int value : mass) {
            if (value > max) max = value;
            if (value < min) min = value;
            if (value % 10 == 0) {
                countNumbersHasOnEndZero++;
                sumNumbersHasOnEndZero = sumNumbersHasOnEndZero + value;
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(countNumbersHasOnEndZero);
        System.out.println(sumNumbersHasOnEndZero);
    }
}
