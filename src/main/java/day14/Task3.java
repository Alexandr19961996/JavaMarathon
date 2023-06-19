package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(parseFileToObjList(new File("people")));
    }

    public static List<Person> parseFileToObjList(File file) throws FileNotFoundException {
        List<Person> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] mass = scanner.nextLine().split(" ");
                if (Integer.parseInt(mass[1]) < 0) {
                    throw new RuntimeException("Некорректный входной файл");
                }
                list.add(new Person(mass[0], Integer.parseInt(mass[1])));
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Файл не найден");
        }
        return list;
    }
}