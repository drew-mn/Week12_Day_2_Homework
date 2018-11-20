package Vehicles;

import Behaviours.IAttack;
import Behaviours.IDamage;

public class CombatDrone extends Vehicle implements IAttack, IDamage {
    public CombatDrone(String type, int healthValue, int attackValue) {
        super(type, healthValue, attackValue);
    }

    public void attack(IDamage attacked) {
        attacked.takeDamage(getAttackValue());
    }

    public void takeDamage(int damage) {
        int healthValue = this.getHealthValue();
        setHealthValue(healthValue - damage);
    }
}
