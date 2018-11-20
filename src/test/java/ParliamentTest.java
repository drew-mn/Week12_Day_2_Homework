import Building.Parliament;
import Kaiju.Ragnorak;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParliamentTest {

    Parliament parliament;
    Ragnorak ragnorak;

    @Before
    public void before(){
        parliament = new Parliament(1000);
        ragnorak = new Ragnorak("Ragnorak", 300, 50);
    }

    @Test
    public void canTakeDamage(){
        parliament.takeDamage(50);
        assertEquals(950, parliament.getHealthValue());
    }

    @Test
    public void canBeAttackedByKaiju(){
        ragnorak.attack(parliament);
        assertEquals(950, parliament.getHealthValue());
    }
}
