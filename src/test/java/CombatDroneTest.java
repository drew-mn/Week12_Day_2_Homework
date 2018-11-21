import Kaiju.Onibaba;
import org.junit.Before;
import org.junit.Test;
import Vehicles.CombatDrone;

import static org.junit.Assert.assertEquals;

public class CombatDroneTest {

    CombatDrone combatDrone;
    Onibaba onibaba;

    @Before
    public void before(){
        combatDrone = new CombatDrone("Unmanned Combat Aerial Vehicle", 100, 20);
        onibaba = new Onibaba("Onibaba", 200, 40);
    }



    @Test
    public void canTakeDamage(){
        combatDrone.takeDamage(40);
        assertEquals(60, combatDrone.getHealthValue());
    }

    @Test
    public void canAttack(){
        combatDrone.attack(onibaba);
        assertEquals(180, onibaba.getHealthValue());
    }

    @Test
    public void canSetHealthValue(){
        combatDrone.setHealthValue(100);
        assertEquals(100, combatDrone.getHealthValue());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(200, combatDrone.getHealthValue());
    }
}
