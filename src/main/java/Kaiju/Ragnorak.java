package Kaiju;
import Behaviours.IAttack;
import Behaviours.IDamage;

public class Ragnorak extends Kaiju implements IAttack, IDamage {

    public Ragnorak(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String move() {
        return "I can move";
    }

    public void attack(IDamage victim) {
        victim.takeDamage(getAttackValue());
    }

    public void takeDamage(int damage) {
        int healthValue = this.getHealthValue();
        setHealthValue(healthValue - damage);
    }
}
