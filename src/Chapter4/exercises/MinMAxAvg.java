package Chapter4.exercises;

import java.util.Scanner;

public class MinMAxAvg {
    public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);
        int counter = 1;
        double total = 0;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;



        while (counter <= 10) {
            System.out.println("Enter Number");
              int fig =cal.nextInt();

            total = total + fig;
            counter = counter + 1;

            if(fig > maxi){
                maxi = fig;
            }
            if(fig < mini){
                mini = fig;
            }


        }
        double average = total / 10;

        System.out.println("Average is "+ average );
        System.out.println("Minimum: " + mini);
        System.out.println("Maximum: "+ maxi);



    }
}
