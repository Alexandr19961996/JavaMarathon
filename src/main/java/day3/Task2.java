package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            double divisible = sc.nextDouble();
            double divisor = sc.nextDouble();
            if (divisor == 0) break;
            else System.out.println(divisible / divisor);
        }
    }
}
