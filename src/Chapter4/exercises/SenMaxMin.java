package Chapter4.exercises;

import java.util.Scanner;

public class SenMaxMin {
    public static void main(String[] args){
        Scanner cal = new Scanner(System.in);
        int counter = 1;
        int total = 0;
        int fig = 0;

        int mini = Integer.MAX_VALUE;
        int maxi = Integer. MIN_VALUE;

        while(fig != -42){
            System.out.println("Enter Number");
              fig = cal.nextInt();
            total = total + fig;
             counter = counter + 1;

             if (fig ==-42)
                 break;


             if(fig >maxi){
                 maxi = fig;
             }
             if(fig < mini){
                 mini = fig;
             }
        }
       double average = total/counter;

        System.out.println("Average is " + average);
        System.out.println("Minimum : " + mini);
        System.out.println("Maximum : " + maxi);
    }

}
