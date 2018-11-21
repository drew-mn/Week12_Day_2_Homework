import Kaiju.Onibaba;
import org.junit.Before;
import org.junit.Test;
import Vehicles.Tank;

import static org.junit.Assert.assertEquals;

public class TankTest {

    Tank tank;
    Onibaba onibaba;

    @Before
    public void before(){
        tank = new Tank("Challenger 2", 500, 100);
        onibaba = new Onibaba("Onibaba", 200, 40);
    }


    @Test
    public void canTakeDamage(){
        tank.takeDamage(40);
        assertEquals(460, tank.getHealthValue());
    }

    @Test
    public void canAttack(){
        tank.attack(onibaba);
        assertEquals(100, onibaba.getHealthValue());
    }

    @Test
    public void canSetHealthValue(){
        tank.setHealthValue(100);
        assertEquals(100, tank.getHealthValue());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(200, tank.getHealthValue());
    }

}
