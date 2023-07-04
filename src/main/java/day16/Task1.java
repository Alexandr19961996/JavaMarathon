package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        printResult(new File("numbers"));
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            int sum = 0;
            int count = 0;
            while (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                count++;
            }
            scanner.close();
            double arithmeticMean = (double) sum / count;
            System.out.print(arithmeticMean + " --> " + String.format("%.3f", arithmeticMean));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

