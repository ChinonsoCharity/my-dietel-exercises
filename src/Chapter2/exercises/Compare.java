package Chapter2.exercises;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner comp = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Enter first integer");
        num1 = comp.nextInt();

        System.out.print("Enter second integer");
        num2 = comp.nextInt();

        if (num1 > num2)
            System.out.println("num1 is larger");

        if (num1 < num2)
            System.out.println("num1 is smaller");

        if (num1 == num2)
            System.out.println(" These numbers are equal");
    }
}
