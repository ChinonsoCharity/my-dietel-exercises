package Chapter3.exercises;

import java.util.Scanner;

public class ClockApplication {
    public static void main(String[] args) {
        Clock wallClock = new Clock();
        Scanner time = new Scanner(System.in);

        System.out.println("Set the time,Hour:");
        int thisHour = time.nextInt();
        wallClock.setHours(thisHour);

        System.out.println("Set the time,Minute:");
        int thisMinute = time.nextInt();
        wallClock.setMinutes(thisMinute);

        System.out.println("Set the time,Seconds:");
        int thisSecond = time.nextInt();
        wallClock.setSeconds(thisSecond);

        System.out.println(wallClock.displayTime());
    }
}
