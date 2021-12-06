package Chapter6;

public class AirConditioner {
    private boolean isOn;
    private int temperature = 16;
    public AirConditioner(String acName) {
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public int getTemperature() {
        if(isOn)
        return temperature;
        return 0;
    }

    public void increaseTemperature() {
        if(isOn && temperature < 30)
        temperature++;
    }

    public void decreaseTemperature() {
        if(isOn && temperature >16)
        temperature--;
    }
}
