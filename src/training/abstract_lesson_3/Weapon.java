package training.abstract_lesson_3;

public abstract class Weapon {
    private int damage;
    protected int rateOfFire;
    int durability;
    String uniqueness;

    Weapon(int damage, int rateOfFire, int durability, String uniqueness) {
        this.damage = damage;
        this.rateOfFire = rateOfFire;
        this.durability = durability;
        this.uniqueness = uniqueness;
    }

    int getDamage() {
        return damage;
    }

    abstract void calculatingTheUtility();

}
