package day11.task2;

public class Magician extends Hero implements MagicAttack {

    private final int magicAtt;

    Magician() {
        super(100, 5, 0, 80);
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
    public String toString() {
        return "Magician {health = " + health + "}";
    }
}
