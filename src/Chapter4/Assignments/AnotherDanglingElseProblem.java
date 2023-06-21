package Chapter4.Assignments;

import java.util.Scanner;

public class AnotherDanglingElseProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter digit x");
        int x = input.nextInt();
        System.out.println("Enter digit y");
        int y = input.nextInt();

        if (x<10)
        if (y>10)
        System.out.println("*****");
        else
        System.out.println("#####");
        System.out.println("$$$$");
    }

}
