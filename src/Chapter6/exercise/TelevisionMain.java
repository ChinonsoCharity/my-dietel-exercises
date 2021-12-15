package Chapter6.exercise;

import Chapter6.Television;

import java.util.Scanner;

public class TelevisionMain {
    private static final Scanner remote = new Scanner(System.in);
    private static Television newWat = new Television("Wat TV");

    public static void main(String[] args) {
        displayNewWatT_V();
    }

    public static void displayNewWatT_V() {
        do {
            int remoteInput = 0;
            String prompt = """
                    WELCOME TO WAT TV
                    Tech is our LifeStyle
                    Press 1 to turn TV ON
                    Press 2 to turn TV Off
                    Press 3 for Volume Option
                    Press 4 for Channel Option
                    """;
            System.out.println(prompt);
            remoteInput = remote.nextInt();
            do {
                switch (remoteInput) {
                    case 1:
//                to do turn on
                        break;
                    case 2:
//                to do turn off
                        break;
                    case 3:
//                to do volume options
                        break;
                    case 4:
//                to do channel options
                }

            } while (true);
        } while (true);
    }
}
