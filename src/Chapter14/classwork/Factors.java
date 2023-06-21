package Chapter14.classwork;

import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {

//        public int numberOfFactor(){}
        Scanner check = new Scanner(System.in);
        System.out.println("Enter a Number and get number of its factors");
        int num = check.nextInt();
        int count = 0;
        for(int i = 1; i<= num; i++){
            if (num % i ==0){
                count++;
            }
        }

        System.out.println(count);
    }
}
