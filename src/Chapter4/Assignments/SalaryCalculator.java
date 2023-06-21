package Chapter4.Assignments;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        calculateSalary();
    }

    // methods

    private static void calculateSalary(){
        Scanner inputHours = new Scanner(System.in);
        System.out.println("Enter Number of Work Hours");
        int hours =inputHours.nextInt();
        System.out.println("Enter gross pay per hour for the first 40Hours ");
        int grossPay = inputHours.nextInt();
        int extraHourPay = grossPay/2;
        int salary;
        if ( hours==40){
             salary = hours*grossPay;
            System.out.println("Your salary for "+hours+"Hours"+ " is $"+salary);
        }
        else
            if (hours>40){
                salary= (40*grossPay) + ((hours-40)*extraHourPay);
                System.out.println("Your salary for "+hours+"Hours"+ " is $"+salary);
            }
    }
}
