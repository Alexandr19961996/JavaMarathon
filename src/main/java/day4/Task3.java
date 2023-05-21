package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        int[][] mass = new int[m][n];
        Random rand = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j] = rand.nextInt(50);
            }
        }
        int sumNumbersOnLine = 0;
        int lineNumber = 0;
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum = sum + mass[i][j];
            }
            if (sum >= sumNumbersOnLine) {
                sumNumbersOnLine = sum;
                lineNumber = i;
            }
        }
        System.out.println(lineNumber);
    }
}
