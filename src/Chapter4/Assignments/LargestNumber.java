package Chapter4.Assignments;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        findLargestNumber();
    }

//    methods
    private static void findLargestNumber(){
        Scanner input = new Scanner(System.in);
        int count = 1;
        int number = 0;
        int maxi = Integer.MIN_VALUE;
        while (count<=10){
            System.out.println("Enter a number:");
            number= input.nextInt();
            count++;
            if (number>maxi)
                maxi = number;
        }
        System.out.println("the largest number is "+ maxi);
    }
}
