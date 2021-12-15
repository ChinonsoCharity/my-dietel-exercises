package Chapter7.drills;

import java.util.Scanner;

public class ArrayScores {
    public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);
        int[] score = new int[10];
        int[]pin = new int[10];
        double total = 0;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;


       for(int k =0; k < score.length;k++){
            System.out.println("Enter Number");
            score[k] =cal.nextInt();
            pin[k] =score[k];


            total = total + score[k];

            if(score[k] > maxi){
                maxi = score[k];
            }
            if(score[k] < mini){
                mini = score[k];
            }

        }

        for(int y =0; y < pin.length; y++){
            System.out.print(pin[y] +", ");
        }


        double average = total / 10.00;
        System.out.println("\nTotal is "+ total);
        System.out.println("Average is "+ average );
        System.out.println("Minimum: " + mini);
        System.out.println("Maximum: "+ maxi);




    }
}
