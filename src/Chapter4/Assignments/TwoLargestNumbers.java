package Chapter4.Assignments;

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        findTwoLargeNumbers();

    }

//    methods

    private static void findTwoLargeNumbers(){
        Scanner check = new Scanner(System.in);
        int [] numbers = new  int[10];
        int largest = numbers[0];
        int secondLargest = numbers[0];
        for (int i = 0;  i<numbers.length; i++){
            System.out.println("Enter 10 numbers");
            numbers[i] = check.nextInt();
            if (numbers[i] > largest){
                secondLargest = largest;
                largest = numbers[i];
            }
            else
                if (numbers[i] > secondLargest){
                    secondLargest = numbers[i];
                }
        }
        System.out.println("the largest number is " + largest);
        System.out.println("the second largest is " + secondLargest);
    }

}
