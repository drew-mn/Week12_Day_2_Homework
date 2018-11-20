package Building;

public abstract class Building{
    private int healthValue;

    public Building(int healthValue) {
        this.healthValue = healthValue;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }
}
