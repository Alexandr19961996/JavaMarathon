package day11.task2;

public class Paladin extends Hero implements Healer {
    Paladin() {
        super(100, 15, 50, 20);
    }

    @Override
    public void healHimself() {
        health = health + 25;
        if (health > 100) health = 100;
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health = hero.health + 10;
        if (hero.health > 100) hero.health = 100;
    }

    @Override
    public String toString() {
        return "Paladin {health = " + health + "}";
    }
}
