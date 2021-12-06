import Chapter6.Television;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    private Television wat = new Television("Wat TV");

    @Test
    public void televisionTurnedOnTest() {
//            given I have TV & it is Off;
        Television wat = new Television("Wat TV");
        assertFalse(wat.isOn());
//            when TV is turned on;
        wat.turnOn();
        assertTrue(wat.isOn());
    }

    @Test
    public void televisionTurnedOff() {
//            given I have TV & TV is On;
        wat.turnOn();
        assertTrue(wat.isOn());
//        when TV is turned Off;
        wat.turnOff();
        assertFalse(wat.isOn());
    }

    @Test
    public void increaseTelevisionVolumeTest() {
//            given I have TV & TV is On;
        wat.turnOn();
        assertTrue(wat.isOn());
//when I increase the volume;
        wat.increaseVolume();
        wat.increaseVolume();
        wat.increaseVolume();
//        check that volume is increased;
        int volume = wat.getVolume();
        assertEquals(3, wat.getVolume());

    }

    @Test
    public void decreaseTelevisionVolumeTest() {
//            given I have TV,TV is on & Volume is increased;
        wat.turnOn();
        assertTrue(wat.isOn());

        for (int v = 0; v < 50; v++) {
            wat.increaseVolume();
        }
        int volume = wat.getVolume();
        assertEquals(50, volume);
//        when volume is decreased;
        wat.decreaseVolume();
        wat.decreaseVolume();
        wat.decreaseVolume();
//        check volume is increased;
        volume = wat.getVolume();
        assertEquals(47, volume);

    }

    @Test
    public void pickChannelsOnTelevisionTest() {
//        given I have TV & TV is On
        wat.turnOn();
        assertTrue(wat.isOn());
//when I pick a channel;
        wat.pickChannel(35);
//        check that the channel chosen is picked
        int channel = wat.getChannel();
        assertEquals(35, channel);
    }
    @Test
    public void pickFromMenuTest() {
//        given I have TV & TV is On
        wat.turnOn();
        assertTrue(wat.isOn());
//when I pick a channel;
        wat.pickMenuOption(35);
//        check that the channel chosen is picked
        int option = wat.getWatMenu();
        assertEquals(35, option);
    }

    @Test
    public void turnOnWebConnectivityOfTelevision() {
        //        given I have TV; TV is On & web connectivity is off;
        wat.turnOn();
        assertTrue(wat.isOn());
        assertFalse(wat.isConnectivityOn());
        //        when I turn On the web connectivity
        wat.turnOnConnectivity();
//        check that the web connectivity is on
        assertTrue(wat.isConnectivityOn());
    }

    @Test
    public void turnOffWebConnectivityOfTelevision() {
        //        given I have TV; TV is On & web connectivity is off;
        wat.turnOn();
        assertTrue(wat.isOn());
        wat.turnOnConnectivity();
        assertTrue(wat.isConnectivityOn());
        // when I turn off the web connectivity;
        wat.turnOffConnectivity();
//        check that web connectivity;
        assertFalse(wat.isConnectivityOn());

    }

    @Test
    public void turnOnMotionControl() {
//        given I have TV,TV is ON & motion control is off;
        wat.turnOn();
        assertTrue(wat.isOn());
        assertFalse(wat.isMotionControlOn());
//        when I turn on the motion control On;
        wat.motionControlOn();
//        check that the motion control is On
        assertTrue(wat.isMotionControlOn());
    }

    @Test
    public void turnOffMotionControl() {
//        given I have TV,TV is ON & motion control is on;
        wat.turnOn();
        assertTrue(wat.isOn());
        wat.motionControlOn();
        assertTrue(wat.isMotionControlOn());
//        when I turn on the motion control Off;
        wat.motionControlOff();
//        check that the motion control is Off;
        assertFalse(wat.isMotionControlOn());
    }

    @Test
    public void turnOnVoiceControl() {
//        given I have TV,TV is ON & voice control is off;
        wat.turnOn();
        assertTrue(wat.isOn());
        assertFalse(wat.isVoiceControlOn());
//        when I turn on the voice control On;
        wat.voiceControlOn();
//        check that the voice control is On
        assertTrue(wat.isVoiceControlOn());
    }

    @Test
    public void turnOffVoiceControl() {
//        given I have TV,TV is ON & voice control is on;
        wat.turnOn();
        assertTrue(wat.isOn());
        wat.voiceControlOn();
        assertTrue(wat.isVoiceControlOn());
//        when I turn off the voice control;
        wat.voiceControlOff();
//        check that the voice control is off;
        assertFalse(wat.isVoiceControlOn());
    }

    @Test
    public void turnOnGameMode() {
//        given I have TV,TV is ON & game mode is off;
        wat.turnOn();
        assertTrue(wat.isOn());
        assertFalse(wat.isGameModeOn());
//        when I turn on the voice control On;
        wat.gameModeOn();
//        check that the voice control is On
        assertTrue(wat.isGameModeOn());
    }
    @Test
    public void turnOffGameMode() {
//        given I have TV,TV is ON & game mode is on;
        wat.turnOn();
        assertTrue(wat.isOn());
        wat.gameModeOn();
        assertTrue(wat.isGameModeOn());
//        when I turn off the motion control;
        wat.gameModeOff();
//        check that the motion control is off;
        assertFalse(wat.isGameModeOn());
    }

}

