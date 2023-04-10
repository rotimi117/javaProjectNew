package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BikeTest {
    Bike myRide = new Bike();





       @Test
       public void onBikeTest(){
        myRide.bikeOn(true);
        assertEquals(true, myRide.callBike());
    }


    @Test
       public void onBikeTest1(){
        myRide.bikeOn(false);
        assertFalse(myRide.callBike());
    }

    @Test
    public void gearTest(){

    }
}
