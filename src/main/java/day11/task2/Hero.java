package day11.task2;

public abstract class Hero implements PhysAttack {
    protected int health;
    protected int physAtt;
    protected int physDef;
    protected int magicDef;

    public Hero(int health, int physAtt, int physDef, int magicDef) {
        this.health = health;
        this.physAtt = physAtt;
        this.physDef = physDef;
        this.magicDef = magicDef;
    }

    @Override
    public int physicalAttack(Hero hero) {
        if (hero.physDef == 0) {
            hero.health = Math.max(hero.health - physAtt, 0);
        } else {
            hero.health = Math.max(hero.health - (physAtt - physAtt * hero.physDef / 100), 0);
        }
        return hero.health;
    }
}
