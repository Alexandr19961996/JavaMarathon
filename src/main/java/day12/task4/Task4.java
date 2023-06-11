package day12.task4;

import java.util.Arrays;
import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        MusicBand group1 = new MusicBand("Queen", 1970,
                new ArrayList<>(Arrays.asList("Фредди Меркьюри", "Брайан Мэй", "Джон Дикон")));
        MusicBand group2 = new MusicBand("Imagine Dragons", 2008,
                new ArrayList<>(Arrays.asList("Дэн Рейнольдс", "Уэйн Сермон", "Бен Макки")));

        group1.printMembers();
        group2.printMembers();

        MusicBand.transferMembers(group1, group2);

        group1.printMembers();
        group2.printMembers();
    }
}
