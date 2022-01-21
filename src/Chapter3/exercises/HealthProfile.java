package Chapter3.exercises;

import java.util.Scanner;

public class HealthProfile {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        StarterHealthProfile userProfile = new StarterHealthProfile();

        System.out.println("Enter your Last name:");
        String lastName = entry.next();
        userProfile.setLastname(lastName);
        System.out.println("Enter your First name :");
        String firstName = entry.next();
        userProfile.setFirstName(firstName);
        System.out.println("Enter your Gender:");
        String gender = entry.next();
        userProfile.setGender(gender);
        System.out.println("Enter your Date of Birth; Day:");
        int day = entry.nextInt();
//        userProfile.setDay(day);
        System.out.println("Month:");
        int month = entry.nextInt();
//        userProfile.setMonth(month);
        System.out.println("Year:");
        int year = entry.nextInt();
//        userProfile.setYear(year);
        userProfile.setDateOfBirth(day,month,year);
        System.out.println("Enter your Height in inches:");
        double height = entry.nextDouble();
        userProfile.setHeight(height);
        System.out.println("Enter your weight in pound:");
        double weight = entry.nextDouble();
        userProfile.setWeight(weight);
        System.out.println("Enter the Present Year:");
        int thisYear = entry.nextInt();
        userProfile.setPresentYear(thisYear);
        System.out.println();
        System.out.println("Here is Your Health Profile"+userProfile.displayProile());
    }
}
