package Kaiju;

import Behaviours.IAttack;
import Behaviours.IDamage;

public class Onibaba extends Kaiju implements IAttack, IDamage {

    public Onibaba(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String move() {
        return "I can move";
    }


    public void takeDamage(int damage) {
        int healthValue = this.getHealthValue();
        setHealthValue(healthValue - damage);
    }

    public void attack(IDamage victim) {
        victim.takeDamage(getAttackValue());
    }
}
