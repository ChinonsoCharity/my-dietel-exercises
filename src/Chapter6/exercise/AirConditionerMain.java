package Chapter6.exercise;

import Chapter6.AirConditioner;

import java.util.Scanner;

public class AirConditionerMain {
    private static final Scanner remote = new Scanner(System.in);
    private static AirConditioner newAirk = new AirConditioner("Airk");

    public static void main(String[] args) {
        String power = """
                Press 1 to turn ON Airk AC
                Press 2 to turn OFF Airk AC
                """;
        System.out.println(power);
        int powerInput = remote.nextInt();
        switch (powerInput) {
            case 1:
                newAirk.turnOn();
                System.out.println("Welcome Airk");
                System.out.println("Quality Air is our Goal");
                System.out.println(newAirk);
                break;
            case 2:
                newAirk.turnOff();
                System.out.println("Good Bye Airk");
                System.out.println(newAirk);
                System.exit(0);
                break;
        }
        displayNewAirk();
    }

    public static void displayNewAirk() {
        do {
            String prompt = """
                    AIRK AC MENU
                    Press 1 to Increase Temperature
                    Press 2 to Decrease Temperature
                    Press 3 to turn OFF Airk AC
                    """;

            System.out.println(prompt);
            int remoteInput = remote.nextInt();
            do {
                switch (remoteInput) {
                    case 1:
                        newAirk.increaseTemperature();
                        System.out.println("Airk Temperature is "+newAirk.getTemperature());
                        System.out.println();
                        break;
                    case 2:
                        newAirk.decreaseTemperature();
                        System.out.println("AirK Temperature is "+newAirk.getTemperature());
                        System.out.println();
                        break;
                    case 3:
                        newAirk.turnOff();
                        System.out.println("Good Bye Airk");
                        System.out.println(newAirk);
                        System.exit(0);
                        break;
                }break;
            } while (true);
        }while (true);
    }
}
