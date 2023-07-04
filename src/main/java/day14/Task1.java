package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        printSumDigits(new File("numbers"));
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            double sum = 0;
            int count = 0;
            while (scanner.hasNext()) {
                sum += Double.parseDouble(scanner.next());
                count++;
            }
            if (count != 10) {
                throw new IllegalArgumentException();
            }
            scanner.close();
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
