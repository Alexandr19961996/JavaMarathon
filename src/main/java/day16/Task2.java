package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try {
            File file1 = new File("/Users/kate/Desktop/Java Project/JavaMarathon/src/main/resources/file1.txt");
            file1.getParentFile().mkdirs();
            PrintWriter printWriter1 = new PrintWriter(file1);
            Random rand = new Random();
            for (int i = 0; i < 1000; i++) {
                printWriter1.print(rand.nextInt(101) + " ");
            }
            printWriter1.close();

            File file2 = new File("/Users/kate/Desktop/Java Project/JavaMarathon/src/main/resources/file2.txt");
            file2.getParentFile().mkdirs();
            PrintWriter printWriter2 = new PrintWriter(file2);
            Scanner scanner = new Scanner(file1);
            int sum = 0;
            int count = 0;
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    sum += scanner.nextInt();
                    count++;
                    if (count == 20) {
                        printWriter2.print((double) sum / count + " ");
                        sum = 0;
                        count = 0;
                    }
                } else scanner.next();
            }
            printWriter2.close();

            printResult(file2);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String[] mass = scanner.nextLine().split(" ");
            scanner.close();
            double sum = 0;
            for (String value : mass) {
                sum += Double.parseDouble(value);
            }
            System.out.println((int) sum);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
