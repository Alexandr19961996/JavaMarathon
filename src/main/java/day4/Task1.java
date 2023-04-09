package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int [] mass = new int[length];
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            mass[i] = rand.nextInt(11);
        }
        int countOfNumbersMoreEight = 0;
        int countOfNumbersEqualsOne = 0;
        int countOfEvenNumbers = 0;
        int countOfOddNumbers = 0;
        int sumNumbers = 0;
        for (int value: mass) {
            System.out.print(value + " ");
            if (value > 8) countOfNumbersMoreEight++;
            if (value == 1) countOfNumbersEqualsOne++;
            if (value % 2 == 0) countOfEvenNumbers++;
            if (value % 2 != 0) countOfOddNumbers++;
            sumNumbers = sumNumbers + value;
        }
        System.out.println();
        System.out.println(mass.length);
        System.out.println(countOfNumbersMoreEight);
        System.out.println(countOfNumbersEqualsOne);
        System.out.println(countOfEvenNumbers);
        System.out.println(countOfOddNumbers);
        System.out.println(sumNumbers);
    }
}
