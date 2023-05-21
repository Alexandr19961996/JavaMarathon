package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {

    private final int magicAtt;

    Shaman() {
        super(100, 10, 20, 20);
        magicAtt = 20;
    }

    @Override
    public int magicalAttack(Hero hero) {
        if (hero.magicDef == 0) {
            hero.health = Math.max(hero.health - magicAtt, 0);
        } else {
            hero.health = Math.max(hero.health - (magicAtt - magicAtt * hero.magicDef / 100), 0);
        }
        return hero.health;
    }

    @Override
    public void healHimself() {
        health = health + 50;
        if (health > 100) health = 100;
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health = hero.health + 30;
        if (hero.health > 100) hero.health = 100;
    }

    @Override
    public String toString() {
        return "Shaman {health = " + health + "}";
    }
}
