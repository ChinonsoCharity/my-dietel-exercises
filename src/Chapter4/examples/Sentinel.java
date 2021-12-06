package Chapter4.examples;

import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args){
        int total =0;
        int score =0;
        do{
            total = total + score;
            System.out.println("Enter a score:");
            Scanner scanner = new Scanner(System.in);
            score = scanner.nextInt();
//            total = total + score; A Bug
        }
        while (score >=0 && score <101);
        System.out.println("Total is "+ total );

//        while (score >=0 && score <101);
//        total = total + score;
//        System.out.println("Enter a score:");
//    Scanner scanner = new Scanner(System.in);
//    score= scanner.nextInt();
//
//        System.out.println("Total is "+ total);

//        int minimumNumber = scanner.nextInt();
//        int maximumNumber = scanner.nextInt();
//        System.out.println(minimumNumber);
//        System.out.println(maximumNumber);

//        final int MY_CONSTANT;

//        MY_CONSTANT = 47;




    }
}
