package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList(new File("people")));
    }

    public static List<Person> parseFileToObjList(File file) {
        try {
            List<Person> list = new ArrayList<>();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] mass = scanner.nextLine().split(" ");
                if (Integer.parseInt(mass[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                list.add(new Person(mass[0], Integer.parseInt(mass[1])));
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