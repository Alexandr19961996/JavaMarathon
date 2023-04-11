package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Алексей", "математика");
        Student student = new Student("Владимир");
        teacher.evaluate(student);
    }
}
