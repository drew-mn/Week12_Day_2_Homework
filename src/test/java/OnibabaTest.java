import Kaiju.Onibaba;
import Kaiju.Ragnorak;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OnibabaTest {

    Onibaba onibaba;
    Ragnorak ragnorak;

    @Before
    public void before(){
        onibaba = new Onibaba("Onibaba", 200, 40);
        ragnorak = new Ragnorak("Ragnorak", 300, 50);
    }

    @Test
    public void canRoar(){
        assertEquals("Roar", onibaba.roar());
    }

    @Test
    public void canGetAttackValue(){
        assertEquals(40, onibaba.getAttackValue());
    }

    @Test
    public void canSetAttackValue(){
        onibaba.setAttackValue(100);
        assertEquals(100, onibaba.getAttackValue());
    }

    @Test
    public void canSetHealthValue(){
        onibaba.setHealthValue(100);
        assertEquals(100, onibaba.getHealthValue());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(200, onibaba.getHealthValue());
    }

    @Test
    public void canTakeDamage(){
        onibaba.takeDamage(50);
        assertEquals(150, onibaba.getHealthValue());
    }

    @Test
    public void canAttackRagnorak(){
        onibaba.attack(ragnorak);
        assertEquals(260, ragnorak.getHealthValue());
    }

    @Test
    public void canAttackOnibaba(){
        ragnorak.attack(onibaba);
        assertEquals(150, onibaba.getHealthValue());
    }

    @Test
    public void canMove(){
        assertEquals("I can move", onibaba.move());
    }

}
