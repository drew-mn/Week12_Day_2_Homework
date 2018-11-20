import Building.TownHall;
import Kaiju.Onibaba;
import Kaiju.Ragnorak;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RagnorakTest {

    Onibaba onibaba;
    Ragnorak ragnorak;

    @Before
    public void before(){
        onibaba = new Onibaba("Onibaba", 200, 40);
        ragnorak = new Ragnorak("Ragnorak", 300, 50);
    }

    @Test
    public void canRoar(){
        assertEquals("Roar", ragnorak.roar());
    }

    @Test
    public void canTakeDamage(){
        ragnorak.takeDamage(40);
        assertEquals(260, ragnorak.getHealthValue());
    }

    @Test
    public void canAttackOnibaba(){
        ragnorak.attack(onibaba);
        assertEquals(150, onibaba.getHealthValue());
    }

    @Test
    public void canAttackRagnorak(){
        onibaba.attack(ragnorak);
        assertEquals(260, ragnorak.getHealthValue());
    }


    @Test
    public void canMove(){
        assertEquals("I can move", ragnorak.move());
    }
}
