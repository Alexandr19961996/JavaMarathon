package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        Random rand = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(mass));
        int maxSum = 0;
        int index = 0;
        for (int i = 0; i < mass.length - 2; i++) {
            int result = 0;
            for (int j = i; j <= i + 3; j++) {
                result += mass[j];
            }
            if (result > maxSum) {
                maxSum = result;
                index = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(index);
    }
}
