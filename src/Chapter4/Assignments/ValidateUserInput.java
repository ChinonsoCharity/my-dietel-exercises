package Chapter4.Assignments;

import java.util.Scanner;

public class ValidateUserInput {
    public static void main(String[] args) {
        validateInput();

    }

//    methods
    public static void validateInput(){
        int passes = 0;
        int failure = 0;
        int count = 1;
        Scanner check = new Scanner(System.in);
        while (count<=10){
            System.out.println("Enter result: 1 for pass or 2 for failure ");
            int result = check.nextInt();

            if (result!=1 && result != 2){
                System.out.println("Wrong Input");
                System.out.println("Enter result: 1 for pass or 2 for failure ");
                result = check.nextInt();
            }

            if (result == 1){
                passes = passes + 1;
                count++;
            }

            if (result == 2){
                failure = failure + 1;
                count++;
            }
        }

        System.out.printf("Passes: %d%n Failed: %d%n",passes,failure);
        if (passes>8){
            System.out.println("Bonus to instructor!");
        }
    }
}
