package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try {
            File fileWrite = new File("/Users/kate/Desktop/Java Project/JavaMarathon/src/main/resources/missing.shoes.txt");
            fileWrite.getParentFile().mkdirs();
            PrintWriter printWriter = new PrintWriter(fileWrite);
            File fileRead = new File("/Users/kate/Desktop/Java Project/JavaMarathon/src/main/resources/shoes.csv");
            Scanner scanner = new Scanner(fileRead);
            while (scanner.hasNextLine()) {
                String[] mass = scanner.nextLine().split(";");
                if (mass.length != 3) {
                    throw new RuntimeException();
                }
                if (Integer.parseInt(mass[2]) == 0) {
                    printWriter.println(mass[0] + ", " + mass[1] + ", " + mass[2]);
                }
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (RuntimeException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
