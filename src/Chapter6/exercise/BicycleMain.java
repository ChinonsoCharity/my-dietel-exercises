//package Chapter6.exercise;
//
//import Chapter6.Bicycle;
//
//import java.util.Scanner;
//
//public class BicycleMain {
//    private static final Scanner drive = new Scanner(System.in);
//    private static Bicycle newBike = new Bicycle("Bikey");
//    public static void main(String[] args) {
//        String power = """
//                Bikey
//                Press 1 to switch ON
//                Press 2 to switch OFF
//                """;
//        System.out.println(power);
//        int powerInput = drive.nextInt();
//        switch (powerInput){
//            case 1:
//                newBike.turnOn();
//                System.out.println("Welcome Bikey");
//                System.out.println("Drive Experience made Decadent");
//                System.out.println(newBike);
//                break;
//            case 2:
//                newBike.turnOff();
//                System.out.println("Good Bye Bikey");
//                System.out.println(newBike);
//                System.exit(0);
//                break;
//        }
//        displayNewBikey();
//    }
//    public static void displayNewBikey() {
//        do {
//            String driveBikey = """
//                    BIKEY OPTION
//                    Press 1 to set Gear
//                    Press 2 to increase Gear
//                    Press 3 to decrease gear
//                    Press 4 to switch OFF
//                    """;
//            System.out.println(driveBikey);
//            int driveInput = drive.nextInt();
//            do {
//                switch (driveInput) {
//                    case 1:
//                        int gearIn = drive.nextInt();
//                        newBike.setGear(gearIn);
//                        System.out.println(newBike.getGear());
//                        System.out.println(newBike.getSpeed());
//                        break;
//                    case 2:
//                        //increase
//                        break;
//                    case 3:
//                        //decrease
//                        break;
//                    case 4:
//                        newBike.turnOff();
//                        System.out.println("Good Bye Bikey");
//                        System.out.println(newBike);
//                        System.exit(0);
//                        break;
//                }break;
//            } while (true);
//        }while (true);
//    }
//}
