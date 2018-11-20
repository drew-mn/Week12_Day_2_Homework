import Building.TownHall;
import Kaiju.Onibaba;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TownHallTest {

    TownHall townHall;
    Onibaba onibaba;
    @Before
    public void before(){
        townHall = new TownHall(800);
        onibaba = new Onibaba("Onibaba", 200, 40);
    }

    @Test
    public void canTakeDamage(){
        townHall.takeDamage(40);
        assertEquals(760, townHall.getHealthValue());
    }

    @Test
    public void canBeAttackedByKaiju(){
        onibaba.attack(townHall);
        assertEquals(760, townHall.getHealthValue());
    }
}
