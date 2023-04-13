package day8;

public class Task1 {
    public static void main(String[] args) {

//        1 способ - конкатенация через обычный класс String

        long startTimeOne = System.currentTimeMillis();
        StringBuilder lineOne = new StringBuilder("0");
        for (int i = 1; i <= 20000; i++) {
            lineOne.append(" ");
            lineOne.append(i);
        }
        long stopTimeOne = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTimeOne - startTimeOne));
        System.out.println(lineOne);

//        2 способ - конкатенация через класс StringBuilder

        long startTimeTwo = System.currentTimeMillis();
        StringBuilder lineTwo = new StringBuilder("0");
        for (int i = 1; i <= 20000; i++) {
            lineTwo.append(" ");
            lineTwo.append(i);
        }
        long stopTimeTwo = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTimeTwo - startTimeTwo));
        System.out.println(lineTwo);
    }
}
