//package Chapter6;
//
//public class Bicycle {
//    private boolean isOn;
//    private int speed = 10;
//    private int gear1 = 1;
//    private int gear2 = 21;
//    private int gear3 = 31;
//    private int gear4 = 41;
//
//    public Bicycle(String bikeName) {
//
//    }
//
//    public boolean isOn() {
//        return isOn;
//    }
//
//    public void turnOn() {
//        isOn = true;
//    }
//
//    public void turnOff() {
//        isOn = false;
//    }
//    public int getGear1(){ if(isOn)
//        return gear1;
//        return 0;
//    }
//    public int getGear2
//
////    public int setGear() {
////        if (speed <= 20) return gear = 1;
////        if (speed > 20 && speed <= 30) return gear = 2;
////        if (speed > 30 && speed<= 40) return gear = 3;
////        return gear = 4;
////    }
////
////    public int getGear() {
////        return gear;
////    }
////
////    public int increaseSpeed(int gear) {
////        do{if (isOn && gear==1) return speed = speed+ 1;
////        if (isOn && gear == 2 ) return speed = speed + 2;
////        if (isOn && gear ==3) return speed = speed + 3;
////        return speed = speed + 4;}while (true);
////    }
////
////    public int getSpeed() {
////        return speed;
////    }
////
////    public int decreaseSpeed(int gear) {
////       do{ if (isOn && gear==1) return speed = speed - 1;
////        if (isOn && gear == 2 ) return speed = speed - 2;
////        if (isOn && gear ==3) return speed = speed - 3;
////        return speed = speed - 4;}while (true);
////    }
//    public String toString(){
//        String Bicycle = "";
//        Bicycle += ("Bikey is "+(isOn()? "ON":"OFF")+"\n");
//        Bicycle += ("Bikey is at Gear "+getGear()+"\n");
//        return Bicycle;
//    }
//}
//
