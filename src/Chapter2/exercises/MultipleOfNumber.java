package Chapter2.exercises;

import java.util.Scanner;

public class MultipleOfNumber {
    public static void main(String[] arg)
    {
        Scanner check = new Scanner(System.in);

        System.out.print("Enter first number");
        System.out.print("Enter second number");

        int num1 = check.nextInt();
        int num2 = check.nextInt();
        int fig = num1 % num2;

        if (fig == 0){
            System.out.printf("%d is a mutiple of %d", num1, num2);
        }

        if (fig != 0){
            System.out.printf("%d is not a multiple of %d", num1, num2);
        }
    }
}
