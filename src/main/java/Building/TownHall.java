package Building;

import Behaviours.IDamage;

public class TownHall extends Building implements IDamage {

    public TownHall(int healthValue) {
        super(healthValue);
    }

    public void takeDamage(int damage) {
        int healthValue = this.getHealthValue();
        setHealthValue(healthValue - damage);
    }
}
