package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int divisible = sc.nextInt();
            int divisor = sc.nextInt();
            if (divisor == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println((double) divisible / divisor);
        }
    }
}
