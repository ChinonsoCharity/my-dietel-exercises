package Chapter4.Assignments;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        calculateSaleCommission();
    }

//    method
    public static void calculateSaleCommission(){
        int total=0;
        int itemValue = 0;
        while (itemValue!=1){
        Scanner calculate = new Scanner(System.in);
            System.out.println("Enter item values sold this week and Enter 1 to exit");
            itemValue = calculate.nextInt();
            total= total+ itemValue;
    }
        double totalEarning = 200 + (total*(9/100.0));
        System.out.println("Your earning for is $" + totalEarning);
}

}
