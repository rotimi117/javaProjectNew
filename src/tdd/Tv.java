package tdd;

import static sun.security.ssl.SSLLogger.isOn;

public class Tv {
    private boolean isOn;
    private int volume = 20;
    public boolean isOn() {
        return isOn;
    }

    public void toggleOn() {
        if (!isOn) isOn = true;
        else isOn = false;
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
    if (volume<40) volume = volume+1;
    }
}
