package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    private AirConditioner airk = new AirConditioner("Airc");

    @Test
    public void acCTurnedOnTest() {
//        given I have an AC; AC is Off
        AirConditioner airk = new AirConditioner("Airc");
        assertFalse(airk.isOn());
//when I turn it on
        airk.turnOn();
        assertTrue(airk.isOn());

    }

    @Test
    public void acTurnOffTest() {
//        given I have AC; AC is on;
        airk.turnOn();
        assertTrue(airk.isOn());
//        when I turn AC off;
        airk.turnOff();
//        check that AC is Off;
        assertFalse(airk.isOn());

    }

    @Test
    public void increaseAcTemperatureTest() {
        //given I have AC; AC is On & the current Temperature is 16;
        airk.turnOn();
        assertTrue(airk.isOn());
        int currentTemp = airk.getTemperature();
        assertEquals(16, currentTemp);
        //when I increase temperature
        airk.increaseTemperature();
        // check that temperature has increased
        airk.getTemperature();
        currentTemp = airk.getTemperature();
        assertEquals(17, currentTemp);
    }

    @Test
    public void decreaseAcTemperatureTest() {
        // givenI have AC; AC is & temperature is above 16
        airk.turnOn();
        assertTrue(airk.isOn());
//        the temperature is increased above 16;
        airk.increaseTemperature();
        airk.increaseTemperature();
        airk.increaseTemperature();
        airk.increaseTemperature();
        int currentTemp = airk.getTemperature();
        assertEquals(20, currentTemp);
//        when I decrease Temperature;
        airk.decreaseTemperature();
        airk.decreaseTemperature();
//        check that Temperature has decreased;
        currentTemp = airk.getTemperature();
        assertEquals(18, currentTemp);

    }

    @Test
    public void acTemperatureCantGoBeyond30Test() {
//        given I have AC; Ac is On & Temperature is at 30;
        airk.turnOn();
        assertTrue(airk.isOn());
        for (int t = 0; t < 14; t++) {
            airk.increaseTemperature();
        }
        int currentTemp = airk.getTemperature();
        assertEquals(30, currentTemp);
//        when I try to increase temperature above 30;
        airk.increaseTemperature();
        airk.increaseTemperature();
//        check that temperature is still at 30;
        currentTemp = airk.getTemperature();
        assertEquals(30, currentTemp);

    }

    @Test
    public void acTemperatureCantGoBelow16Test() {
//        given I have AC; AC is On & temperature is 16;
        airk.turnOn();
        assertTrue(airk.isOn());
        int currentTemp = airk.getTemperature();
        assertEquals(16, currentTemp);
//        when I try to decrease temperature below 16;
        airk.decreaseTemperature();
        airk.decreaseTemperature();
//        check that temperature is still at 16;
        currentTemp = airk.getTemperature();
        assertEquals(16, currentTemp);

    }

    @Test
    public void acTemperatureIsZeroWhenOffTest() {
//        given I have AC & AC is Off;
        airk.turnOff();
        assertFalse(airk.isOn());
//        check that Temperature is 0
        int temp = airk.getTemperature();
        assertEquals(0, temp);
    }

    @Test
    public void acTemperatureCantBeIncreaseWhenOffTest() {
//        give I have AC & AC is Off;
        airk.turnOff();
        assertFalse(airk.isOn());
//        when I increase temperature;
        airk.increaseTemperature();
//        check that Temperature is 0;
        int temp = airk.getTemperature();
        assertEquals(0, temp);
    }

    @Test
    public void acTemperatureCantBeDecreaseWhenOffTest() {
//        give I have AC & AC is Off;
        airk.turnOff();
        assertFalse(airk.isOn());
//        when I decrease temperature;
        airk.decreaseTemperature();
//        check that Temperature is 0;
        int temp = airk.getTemperature();
        assertEquals(0, temp);
    }
}
