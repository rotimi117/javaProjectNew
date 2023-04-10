package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TvTest {
    @Test
    public void turnTvOnTest(){
        //given i have a tv and it is off
        Tv tv = new Tv();
        assertFalse(tv.isOn());
        //when i turn on the tv
        tv.toggleOn();
        //check that tv is on
        assertTrue(tv.isOn());
    }

    @Test
    public void turnTvOffTest(){
        //given i have a tv and it is on
        Tv tv = new Tv();
        tv.toggleOn();
        assertTrue(tv.isOn());
        //when i turn the tv off
        tv.toggleOn();
        //check that tv is off
        assertFalse(tv.isOn());
    }
    @Test
    public void increaseVolumeTest(){
        //given that the volume is on 20
        Tv tv = new Tv();
        tv.toggleOn();
        assertEquals(20, tv.getVolume());
        assertTrue(tv.isOn());
        //when i increase the volume to 40
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        //check that volume is 40
        assertEquals(40, tv.getVolume());
    }
    @Test
    public void increaseVolumeAbove100DoesNotWork(){
        //given that i have a tv, it is on, and volume is 40
        Tv tv = new Tv();
        tv.toggleOn();
        assertTrue(tv.isOn());
        int count = 0;
          while (count <= 21){
              tv.increaseVolume();
              count++;
          }
          assertEquals(40, tv.getVolume());
          //when i increase volume
        tv.increaseVolume();
        //check that volume is 100
        assertEquals(40, tv.getVolume());

    }


}
