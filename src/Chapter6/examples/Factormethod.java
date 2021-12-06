package Chapter6.examples;

import java.util.Scanner;

public class Factormethod {
    //    Class Methods : FOR METHOD 1
    public static int calculateFactorsOf(int userInput) {
        int factors = 0;
//        count
        for (int fac = 1; fac <= userInput; fac++)
            if (userInput % fac == 0) factors++;
        return factors;
    }
// FOR  METHOD 3;
    public static void calculatePrimeNumber() {
        System.out.println(" Enter a number");
        Scanner inputCollector = new Scanner(System.in);
        int userInput = inputCollector.nextInt();

        int factors = calculateFactorsOf(userInput);

        if (factors <= 2) {
            System.out.printf("%d is a Prime Factor", userInput);
        } else {
            System.out.printf("%d is Not a Prime Factor", userInput);
        }
    }

    public static void isEven(int userInput){
        if( userInput % 2==0){
            System.out.println("Yes! it is even");}
            else{
                System.out.println(" No! it is not even");
        }
    }

//    METHOD 1;

//    public static void main(String[] args) {
//        System.out.println(" Enter a number");
//        Scanner inputCollector = new Scanner(System.in);
//       int factors = 0;
////        count
//        for (int fac = 1; fac <= userInput; fac++)
//            if (userInput % fac == 0) factors++;
//        if (factors <= 2) {
//            System.out.printf("%d is a Prime Factor", userInput);
//        }
//        else {
//            System.out.printf("%d is Not a Prime Factor", userInput);
//        }
//    }

//    METHOD 2;

//        public static void main(String[] args){
//            calculatePrimeNumber();
//        }
//    public static void calculatePrimeNumber(){
//        System.out.println(" Enter a number");
//        Scanner inputCollector = new Scanner(System.in);
//        int userInput = inputCollector.nextInt();
//
//        int factors = calculateFactorsOf(userInput);
//
//        if (factors <= 2) {
//            System.out.printf("%d is a Prime Factor", userInput);
//        }
//        else {
//            System.out.printf("%d is Not a Prime Factor", userInput);
//        }

//    METHOD 3;

    public static void main(String[] args){
        calculatePrimeNumber();
        isEven(24);
        System.out.println("\nI don finish");
        System.out.println(calculateFactorsOf(100));
    }
    }





