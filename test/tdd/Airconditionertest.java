package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Airconditionertest {



    @Test
    public void airConditionerIsOn(){

        Airconditioner hisense = new Airconditioner();
        hisense.setOn(true);
        assertTrue(hisense.isOn());

    }

    @Test
    public void airConditionerIsOff(){

        Airconditioner hisense = new Airconditioner();
        hisense.setOn(false);
        assertFalse(hisense.isOff());

    }

    @Test
    public void temperatureIncrease() {

        Airconditioner hisense = new Airconditioner();
        hisense.setOn(true);

        hisense.temperatureIncrease(16);
        assertEquals(21);  hisense.getTemperature();


    }

    private void assertEquals(int i) {
    }


}
