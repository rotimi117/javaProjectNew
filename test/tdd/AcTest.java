package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AcTest {
    @Test
    public void turnAcOnTest(){
        //given i have an ac and it is off
        Ac ac = new Ac();
        assertFalse(ac.isOn());
        //when i turn it on
        ac.toggleOn();
        //check that it is on
        assertTrue(ac.isOn());
    }

    @Test
    public void turnAcOffTest(){
        //given that i have an ac and it is on
        Ac ac = new Ac();
        ac.toggleOn();
        assertTrue(ac.isOn());
        //when i turn it off
        ac.toggleOn();
        //check that ac is off
        assertFalse(ac.isOn());
    }
    @Test
    public void increaseTemperatureTest(){
        //given i have an ac, it is on and the temperature is 16
        Ac ac = new Ac();
        ac.toggleOn();
        assertEquals(16, ac.getTmperature());
        assertTrue(ac.isOn());
        //when i increase temperature
        ac.increasetempersture();
        ac.increasetempersture();
        //check that temperature is 18
        assertEquals(18, ac.getTmperature());
    }
    @Test
    public void increaseTemperatureAbove30DoesNotWorkTest(){
        //given i have an ac, it is on, and temperature is 30
        Ac ac = new Ac();
        ac.toggleOn();
        assertTrue(ac.isOn());
        int count = 0;
                while (count <= 13){
                    ac.increasetempersture();
                    count++;
                }
                assertEquals(30, ac.getTmperature());
                //when i increase temperature
               ac.increasetempersture();
               //check that temperature is 30
             assertEquals(30, ac.getTmperature());

    }


}
