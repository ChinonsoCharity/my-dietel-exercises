//package Chapter6;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class BicycleTest {
//    private Bicycle bike = new Bicycle("Bikey");
//
//    @Test
//    public void bicycleTurnedOnTest() {
//        Bicycle bike = new Bicycle("Bikey");
//        assertFalse(bike.isOn());
//
//        bike.turnOn();
//        assertTrue(bike.isOn());
//    }
//
//    @Test
//    public void bicycleTurnedOffTest() {
//        bike.turnOn();
//        assertTrue(bike.isOn());
//
//        bike.turnOff();
//        assertFalse(bike.isOn());
//    }
//
//    @Test
//    public void setBicycleGear(){
//        bike.turnOn();
//        assertTrue(bike.isOn());
//
//        bike.setGear(3);
//        int gear = bike.getGear();
//        assertEquals(3,gear);
//
//    }
//
//    @Test
//    public void bicycleGearAccelerationTest() {
//        bike.turnOn();
//        assertTrue(bike.isOn());
//
//        bike.increaseSpeed(2);
//        int speed = bike.getSpeed();
//        assertEquals(12, speed);
//
//    }
//
//    @Test
//    public void bicycleDecelerationTest() {
//        bike.turnOn();
//        assertTrue(bike.isOn());
//
//        bike.decreaseSpeed(3);
//        int speed = bike.getSpeed();
//        assertEquals(7, speed);
//
//    }
//}