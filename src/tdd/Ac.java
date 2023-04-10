package tdd;

import static sun.security.ssl.SSLLogger.isOn;

public class Ac {



    private boolean isOn;
   private int temperature = 16;
    public boolean isOn() {
        return isOn;
    }

    public void toggleOn() {
        isOn = !isOn;


    }

    public int getTmperature() {
        return temperature;
    }

    public void increasetempersture() {
      if (temperature<30) temperature = temperature+1;
    }
}
