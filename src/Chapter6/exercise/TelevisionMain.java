package Chapter6.exercise;

import Chapter6.Television;

import java.util.Scanner;

public class TelevisionMain {
    private static final Scanner remote = new Scanner(System.in);
    private static Television newWat = new Television("Wat TV");

    public static void main(String[] args) {
        String power = """
                Press 1 to turn Wat TV ON
                Press 2 to turn Wat TV OFF
                """;
        System.out.println(power);
        int powerInput = remote.nextInt();
        switch (powerInput){
            case 1:
                newWat.turnOn();
                System.out.println("Welcome, This is Wat TV");
                System.out.println("Tech is our LifeStyle");
                System.out.println(newWat);
                break;
            case 2:
                newWat.turnOff();
                System.out.println("Good Bye");
                System.out.println(newWat);
                System.exit(0);
                break;
        }
        displayNewWatT_V();
    }

    public static void displayNewWatT_V() {
        do {
            int remoteInput = 0;
            String prompt = """
                    WAT TV MENU
                    Press 1 for Volume Option
                    Press 2 for Channel Option
                    Press 3 to turn TV Off
                    """;
            System.out.println(prompt);
            remoteInput = remote.nextInt();
            do {
                switch (remoteInput) {

                    case 1:
                        String vOption = """
                                Press 1 to Increase Volume
                                Press 2 to Decrease Volume
                                """;
                        System.out.println(vOption);
                        int volumeInput = remote.nextInt();
                        do {
                            switch (volumeInput) {
                                case 1:
                                    newWat.increaseVolume();
                                    System.out.println("Volume is " + newWat.getVolume());
                                    System.out.println();
                                    break;
                                case 2:
                                    newWat.decreaseVolume();
                                    System.out.println("Volume is " + newWat.getVolume());
                                    System.out.println();
                                break;
                            }
                            break;
                        } while (true);
                        break;
                    case 2:
                        System.out.println("Enter your Preferred Channel");
                        int channel = remote.nextInt();
                        newWat.pickChannel(channel);
                        System.out.println("You are now Watching Channel " +newWat.getChannel() +"\n");
                        break;
                    case 3:
                        newWat.turnOff();
                        System.out.println("Good Bye");
                        System.out.println(newWat);
                        System.exit(0);
                        break;
                }break;

            } while (true);
        } while (true);
    }
}
