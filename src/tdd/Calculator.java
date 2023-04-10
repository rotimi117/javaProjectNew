package tdd;


import static sun.security.ssl.SSLLogger.isOn;

public class Calculator {
    private boolean isOn;

    public boolean isOn() {
        return isOn;
    }

    public void toggleOn() {
        isOn = ! isOn;
    }


}
