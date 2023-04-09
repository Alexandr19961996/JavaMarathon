package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberFloor = sc.nextInt();
        if (numberFloor >= 1 && numberFloor <= 4) System.out.println("Малоэтажный дом");
        else if (numberFloor >= 5 && numberFloor <= 8) System.out.println("Среднеэтажный дом");
        else if (numberFloor >= 9) System.out.println("Многоэтажный дом");
        else System.out.println("Ошибка ввода");
    }
}
