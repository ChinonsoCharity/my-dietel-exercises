package Chapter4.Assignments;

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
            findTheLargeNumber();
    }

    public static void findTheLargeNumber(){
        int counter =0;
        int number = 0;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i <10; i++){
            Scanner find = new Scanner(System.in);
            System.out.println("Enter A number");
            number = find.nextInt();
            if (number>largest){
                largest=number;
            }
        }
        System.out.println("The Largest numbers is "+largest);
    }
}
