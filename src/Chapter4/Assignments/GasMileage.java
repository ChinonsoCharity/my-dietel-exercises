package Chapter4.Assignments;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        int gallons = 0;
        int miles = 0;
        double combinedAverage = 0.0;
        while (gallons !=-1 && miles != -1) {
            Scanner record = new Scanner(System.in);
            System.out.println("Enter the number of Gallons of fuel Tankful per Trip : ");
            gallons = record.nextInt();
            System.out.println("Enter the number of miles driven per Trip");
            miles = record.nextInt();
            double average = (miles / gallons) * 1.0;
            combinedAverage = combinedAverage + average;
            System.out.println("The average mile per gallon is " + average);
        }
        System.out.println("Combined Average miles per gallon is "+ combinedAverage);
    }
}
