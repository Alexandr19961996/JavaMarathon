package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList(new File("people")));
    }

    public static List<String> parseFileToStringList(File file) {
        try {
            List<String> list = new ArrayList<>();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
            for (String value : list) {
                String[] mass = value.split(" ");
                if (Integer.parseInt(mass[1]) < 0) {
                    throw new IllegalArgumentException();
                }
            }
            scanner.close();
            return list;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
