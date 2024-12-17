package training.abstract_lesson_3;

public class Sword extends Weapon {
    Sword(int damage, int rateOfFire, int durability, String uniqueness) {
        super(damage, rateOfFire, durability, uniqueness);
    }

    void calculatingTheUtility() {
        System.out.printf("\nОбщая оценка пользы %s из 9ти.\nОтличительной " +
                        "особенностью данного вида является:\n%s\n",
                getDamage() + rateOfFire + durability, uniqueness);
    }
}
