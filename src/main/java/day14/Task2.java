package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(parseFileToStringList(new File("people")));
    }

    public static List<String> parseFileToStringList(File file) throws FileNotFoundException {
        List<String> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
            for (String value : list) {
                String[] mass = value.split(" ");
                if (Integer.parseInt(mass[1]) < 0) {
                    throw new RuntimeException("Некорректный входной файл");
                }
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Файл не найден");
        }
        return list;
    }
}
