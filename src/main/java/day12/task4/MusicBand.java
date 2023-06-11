package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> groupMembers;

    public MusicBand(String name, int year, List<String> groupMembers) {
        this.name = name;
        this.year = year;
        this.groupMembers = groupMembers;
    }

    public List<String> getMembers() {
        return groupMembers;
    }

    public static void transferMembers(MusicBand groupA, MusicBand groupB) {
        groupB.groupMembers.addAll(groupA.groupMembers);
        groupA.groupMembers = new ArrayList<>();
    }

    public void printMembers() {
        System.out.println(groupMembers);
    }
}
