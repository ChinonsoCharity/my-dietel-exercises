package Chapter6;

public class Television {

    private boolean isOn;
    private int volume = 0;
    private int watChannel;
    private int watMenu;
    private boolean isConnectivityOn;
    private boolean isMotionControlOn;
    private boolean isVoiceControlOn;
    private boolean isGameModeOn;

    public Television(String tvName) {
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

    public int getVolume() {
        if(isOn)
            return volume;
        return 0;
    }

    public void increaseVolume() {
        if(isOn && volume<=100)
            volume++;
    }

    public void decreaseVolume() {
        if(isOn && volume>0)
            volume--;
    }

    public void pickChannel(int channel) {
        if(isOn)
        watChannel = channel;
    }

    public int getChannel() {
        if(isOn && watChannel<=200)
            return watChannel;
        return 0;
    }
    public void pickMenuOption(int option) {
        watMenu = option;
    }

    public int getWatMenu() {
        return watMenu;
    }

    public boolean isConnectivityOn(){
        return isConnectivityOn;
    }

    public void turnOnConnectivity() {
        isConnectivityOn = true;
    }

    public void turnOffConnectivity() {
        isConnectivityOn = false;
    }

    public boolean isMotionControlOn() {
        return isMotionControlOn;
    }

    public void motionControlOn() {
        isMotionControlOn = true;
    }

    public void motionControlOff() {
        isMotionControlOn = false;
    }

    public boolean isVoiceControlOn() {
        return isVoiceControlOn;
    }

    public void voiceControlOn() {
        isVoiceControlOn = true;
    }

    public void voiceControlOff() {
        isVoiceControlOn = false;
    }

    public boolean isGameModeOn() {
        return isGameModeOn;
    }

    public void gameModeOn() {
        isGameModeOn = true;
    }

    public void gameModeOff() {
        isGameModeOn =false;
//        need to know
    }
    public String toString(){
        String Television = "" ;
        Television += "Wat TV is "+(isOn()? "ON":"OFF")+"\n";
        Television += "Volume is "+ getVolume() + "\n";
        Television += "Channel " + getChannel() + "\n";
        return Television;
    }


}
