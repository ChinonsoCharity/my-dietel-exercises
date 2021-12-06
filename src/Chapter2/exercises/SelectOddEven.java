package Chapter2.exercises;

import java.util.Scanner;

public class SelectOddEven {

        public static void main(String[] args)
        {
            Scanner check = new Scanner(System.in);

            System.out.print("Enter a number");
            int num1 = check.nextInt();

            int fig = num1 % 2;

            if (fig != 0){
                System.out.printf("%d is Odd", num1);
            }
            if (fig == 0){
                System.out.printf("%d is Even", num1);
            }
        }
    }


