package activityStarterCode.extractInterface;

import java.util.Random;

public class GameCharacter {
    private static final Random rand = new Random();
    private final String name;
    private int hitPoints, mana;
    private final Attack weapon;

    public GameCharacter(String name, int hitPoints, int mana, Attack weapon) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.mana = mana;
        this.weapon = weapon;
    }

    public String attack (GameCharacter target) {
        return (weapon.makeAttack(this, target));
    }

    /*public String attack(GameCharacter target) {
        if (fireballDamage > 0) {
            if (this.useMana(fireballManaRequired)) {
                target.takeDamage(fireballDamage);
                return this.getName() + " hit " + target.getName() + " with a fireball for "
                    + fireballDamage + " points of damage";
            } else {
                return this.getName() + " did not have enough mana for a fireball attack";
            }
        } else {
            int damage = rand.nextInt(swordMaxDamage - swordMinDamage + 1) + swordMinDamage;
            target.takeDamage(damage);
            return this.getName() + " struck " + target.getName() + " with a sword for "
                + damage + " points of damage";
        }
    }
     */

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getMana() {
        return mana;
    }

    public void takeDamage(int damage) {
        hitPoints = Math.max(0, hitPoints - damage);
    }

    public boolean useMana(int amount) {
        if (mana >= amount) {
            mana -= amount;
            return true;
        } else {
            return false;
        }
    }
}
