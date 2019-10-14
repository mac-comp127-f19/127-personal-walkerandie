package activityStarterCode.extractInterface;

import java.util.Random;

public class Sword implements Attack {
    private static final Random rand = new Random();

    private int minDamage;
    private int maxDamage;

    public Sword (int minDamage, int maxDamage) {
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }


    @Override
    public String makeAttack(GameCharacter attacker, GameCharacter target) {
        int damage = rand.nextInt(maxDamage - minDamage + 1) + minDamage;
        target.takeDamage(damage);
        return attacker.getName() + " struck " + target.getName() + " with a sword for "
                + damage + " points of damage";
    }
}
