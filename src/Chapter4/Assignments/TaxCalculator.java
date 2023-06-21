package Chapter4.Assignments;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
                calculatedTax();
    }


// methods
    public static void calculatedTax(){
      double tax15 = 0;
      double  tax20 = 0;
      Scanner  calculate = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = calculate.nextLine();
        System.out.println("Enter earnings");
        int earnings = calculate.nextInt();

        if (earnings<=30000){
            tax15 = earnings * (15/100.0);
            System.out.println("Total tax on " + name+ "'s income is $"+ tax15);
        }
        if (earnings>30000){
            tax20 = earnings * (20/100.0);
            System.out.println("Total tax on " + name+ "'s income is $"+ tax20);
        }
    }
}
