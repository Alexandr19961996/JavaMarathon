package day11.task2;

public class Warrior extends Hero {

    Warrior() {
        super(100, 30, 80, 0);
    }

    @Override
    public String toString() {
        return "Warrior {health = " + health + "}";
    }
}
