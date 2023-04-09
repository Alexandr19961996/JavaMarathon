package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int divisible = sc.nextInt();
            int divisor = sc.nextInt();
            if (divisor == 0) break;
            else System.out.println((double) divisible / divisor);
        }
    }
}
