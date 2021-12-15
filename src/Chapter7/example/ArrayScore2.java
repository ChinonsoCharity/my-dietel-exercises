package Chapter7.example;

import java.util.Scanner;

public class ArrayScore2 {

    public static void main(String[] args) {
        Scanner fig = new Scanner(System.in);
        int ARRAY_LENGTH = 10;
        int[] scores = new int[ARRAY_LENGTH];
//        collect scores
        for (int r = 0; r < scores.length; r++) {
            System.out.println("Enter Score");
            scores[r] = fig.nextInt();
        }
//        display scores
        for (int r = 0; r < scores.length; r++){
            System.out.print(scores[r]+" ");
            System.out.println();
        }
//        maximum scores
        int maxi = scores[0];

//        Enhanced for; for(int score : scores)
        for (int i : scores) {
            maxi = Math.max(maxi, i);
        }
        System.out.println("Maximum is "+maxi);

//        minimum scores
        int mini = scores[0];
        for (int score : scores) {
            mini = Math.min(maxi, score);
        }
        System.out.println("Maximum is "+mini);

//        total
        int total = 0;
        for (int score : scores) {
            total = total + score;
        }
        System.out.println("Total is "+total);

//        Average
        double average = total/ scores.length;
        System.out.println("Average is "+average);

//        while loop in Array
//        int k = 0;
//        while (k< scores.length){
//            System.out.println("Enter score");
//            scores[k] = fig.nextInt();
//            k++;
//        }
    }
}