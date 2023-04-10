package tdd;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
   Calculator calculator = new Calculator();
   @Test
    public void turnOnCalculatorTest(){
       //given that you have a calculator and it is off
       Calculator calculator = new Calculator();
       assertFalse(calculator.isOn());
       //when you turn it on
       calculator.toggleOn();
       //check if it is on
       assertTrue(calculator.isOn());
   }
   @Test
   public void turnOffCalculatorTest(){
     //given i have a calculator and it is on
      calculator.toggleOn();
      assertTrue(calculator.isOn());
      //when i turn it off
      calculator.toggleOn();
      //check if it is off
      assertFalse(calculator.isOn());
   }

   @Test
   public void AdditionTest(){
      //given that i have calculator and it is on, i want it to do 2+2
      calculator.toggleOn();
      assertTrue(calculator.isOn());
      //when i input my data

   }


}
