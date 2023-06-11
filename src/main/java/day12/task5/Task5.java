package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        MusicBand group1 = new MusicBand("Queen", 1970,
                new ArrayList<>(Arrays.asList(new MusicArtist("Фредди Меркьюри", 45),
                        new MusicArtist("Брайан Мэй", 34),
                        new MusicArtist("Джон Дикон", 39))));
        MusicBand group2 = new MusicBand("Imagine Dragons", 2008,
                new ArrayList<>(Arrays.asList(new MusicArtist("Дэн Рейнольдс", 32),
                        new MusicArtist("Уэйн Сермон", 52),
                        new MusicArtist("Бен Макки", 43))));

        System.out.println(group1.getMembers());
        System.out.println(group2.getMembers());

        MusicBand.transferMembers(group1, group2);

        group1.printMembers();
        group2.printMembers();
    }
}
