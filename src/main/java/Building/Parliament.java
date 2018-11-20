package Building;

import Behaviours.IDamage;

public class Parliament extends Building implements IDamage {

    public Parliament(int healthValue) {
        super(healthValue);
    }

    public void takeDamage(int damage) {
        int healthValue = this.getHealthValue();
        setHealthValue(healthValue - damage);
    }
}