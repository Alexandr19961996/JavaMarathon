package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int [] mass = new int[100];
        Random rand = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(10000);
        }
        int maxSum = 0;
        int index = 0;
        for (int i = 0; i < mass.length-2; i++) {
            int result = 0;
            for (int j = i; j <= i+2; j++) {
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
