package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        printSumDigits(new File("numbers"));
    }

    public static void printSumDigits(File file) throws FileNotFoundException {
        try {
            Scanner scanner = new Scanner(file);
            double sum = 0;
            int count = 0;
            while (scanner.hasNext()) {
                sum += Double.parseDouble(scanner.next());
                count++;
            }
            if (count != 10) {
                throw new RuntimeException("Некорректный входной файл");
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Файл не найден");
        }
    }
}
