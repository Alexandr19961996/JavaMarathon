package day12.task3;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> list = new ArrayList<>();
        MusicBand group1 = new MusicBand("Queen", 1970);
        MusicBand group2 = new MusicBand("Imagine Dragons", 2008);
        MusicBand group3 = new MusicBand("Nirvana", 1987);
        MusicBand group4 = new MusicBand("The Beatles", 1960);
        MusicBand group5 = new MusicBand("Linkin Park", 1996);
        MusicBand group6 = new MusicBand("Rammstein", 1994);
        MusicBand group7 = new MusicBand("BTS", 2013);
        MusicBand group8 = new MusicBand("Little Big", 2013);
        MusicBand group9 = new MusicBand("Twenty One Pilots", 1970);
        MusicBand group10 = new MusicBand("Pink Floyd", 1965);

        list.add(group1);
        list.add(group2);
        list.add(group3);
        list.add(group4);
        list.add(group5);
        list.add(group6);
        list.add(group7);
        list.add(group8);
        list.add(group9);
        list.add(group10);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        System.out.println(groupsAfter2000(list));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> newList = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                newList.add(band);
            }
        }
        return newList;
    }
}
