package Chapter4.examples;//count number from 1 to 100
//check if number divided by 2 return a zero
// if number returns a zero, print number

public class EvenAndOddNumber {
    public static void main(String[] args) {
//        int number = 1;
//        while (number <= 100) {
//            if (number % 2 == 0) System.out.print(number + " ");
//            number = number + 1;


            for(int number = 1; number <= 100; number = number + 1) {
                if (number % 2 == 0) System.out.print(number + " ");



            }
        }
    }

