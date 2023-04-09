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
            if (mass[i] + mass[i+1] + mass[i+2] > maxSum) {
                maxSum = (mass[i] + mass[i+1] + mass[i+2]);
                index = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(index);
    }
}
