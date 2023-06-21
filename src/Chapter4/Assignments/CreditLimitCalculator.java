


package Chapter4.Assignments;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {

       checkCreditLimit();
    }

//    methods
    public static void checkCreditLimit() {
        Scanner check = new Scanner(System.in);
        System.out.println("Enter 10 digit account number");
        String [] account = check.nextLine().split("");
        if (account.length == 10) {
            System.out.println("Input the balance at the beginning of the month");
            int balance = check.nextInt();
            System.out.println("Enter total amount charged by the customer");
            int charges = check.nextInt();
            System.out.println("Enter total credit applied");
            int credit = check.nextInt();
            calculateCreditLimit(balance, charges, credit);

        } else {
            System.out.println("Wrong account,Enter correct account");
            checkCreditLimit();
        }
    }

    private static void calculateCreditLimit(int balance, int charges, int credit) {
        int creditLimit = 150000;
        int newBalance = balance + charges - credit;

            if (newBalance < creditLimit) {
                System.out.println("Your Balance is " + newBalance);
            } else if (newBalance > creditLimit) {
                System.out.println("Your Balance is " + newBalance + " and Your Credit Limit is Exceeded");
            }
        }
}







