package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> groupMembers;

    public MusicBand(String name, int year, List<MusicArtist> groupMembers) {
        this.name = name;
        this.year = year;
        this.groupMembers = groupMembers;
    }

    public List<MusicArtist> getMembers() {
        return groupMembers;
    }

    public static void transferMembers(MusicBand groupA, MusicBand groupB) {
        groupB.groupMembers.addAll(groupA.groupMembers);
        groupA.groupMembers.clear();
    }

    public void printMembers() {
        System.out.println(groupMembers);
    }
}
