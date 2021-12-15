package Chapter6;

public class Bicycle {
    private boolean isOn;
    private int speed = 10;
    private String gear;

    public Bicycle(String bikeName) {

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

    public String setGear(int speed) {
        if (speed <= 20) return gear = "1";
        if (speed > 20 && speed <= 30) return gear = "2";
        if (speed > 30 && speed<= 40) return gear = "3";
        return gear = "4";
    }

    public String getGear() {
        return gear;
    }

    public int increaseSpeed(String gear) {
        if (isOn && gear=="1") return speed = speed+ 1;
        if (isOn && gear == "2" ) return speed = speed + 2;
        if (isOn && gear =="3") return speed = speed + 3;
        return speed = speed + 4;
    }

    public int getSpeed() {
        return speed;
    }

    public int decreaseSpeed(String gear) {
        if (isOn && gear=="1") return speed = speed - 1;
        if (isOn && gear == "2" ) return speed = speed - 2;
        if (isOn && gear =="3") return speed = speed - 3;
        return speed = speed - 4;
    }
}

