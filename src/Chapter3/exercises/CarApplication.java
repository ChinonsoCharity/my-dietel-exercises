package Chapter3.exercises;

import java.util.Scanner;

public class CarApplication {
    private static final Scanner drive = new Scanner(System.in);
    public static void main(String[] args) {
        Car eragon = new Car();
        System.out.println("Enter the first Car Model:");
        String model1 = drive.nextLine();
        System.out.println("Enter the first model year:");
        int year1 = drive.nextInt();
        eragon.setModel(model1);
        eragon.setYear(year1);
        System.out.println("Your Car is "+ eragon.getModel()+" "+ eragon.getYear()+" Model");

        System.out.println("Enter the discount on "+ eragon.getModel()+" "+ eragon.getYear()+" Model:");
        int discount = drive.nextInt();
        eragon.setPercentageDiscount(discount);
        System.out.println("The discount on "+ eragon.getModel()+" "+ eragon.getYear()+" Model is "+eragon.getPercentageDiscount()+"%" );

        System.out.println("Enter the price of " + eragon.getModel()+" "+ eragon.getYear()+" Model:");
        double grossPrice = drive.nextDouble();
        eragon.setPrice(grossPrice);
        System.out.println("The Selling price of "+ eragon.getModel()+" "+ eragon.getYear()+" Model is "+ eragon.getPrice());
        System.out.println("The Selling price of " + eragon.getModel()+" "+ eragon.getYear()+" Model with Discount is N"
                            + eragon.calculatePriceWithDiscount());
        System.out.println();
//        SECOND CAR
        Car elektra = new Car();

        System.out.println("Enter the next Car Model:");
        String model2 = drive.next();
        System.out.println("Enter the next model year:");
        int year2 = drive.nextInt();
        elektra.setModel(model2);
        elektra.setYear(year2);
        System.out.println("Your Car is "+ elektra.getModel()+" "+ elektra.getYear()+" Model");

        System.out.println("Enter the discount on "+ elektra.getModel()+" "+ elektra.getYear()+" Model:");
        int discount2 = drive.nextInt();
        elektra.setPercentageDiscount(discount);
        System.out.println("The discount on "+ elektra.getModel()+" "+ elektra.getYear()+" Model is "+elektra.getPercentageDiscount()+"%" );

        System.out.println("Enter the price of " + elektra.getModel()+" "+ elektra.getYear()+" Model:");
        double grossPrice2 = drive.nextDouble();
        elektra.setPrice(grossPrice2);
        System.out.println("The Selling price of "+ elektra.getModel()+" "+ elektra.getYear()+" Model is "+ elektra.getPrice());
        System.out.println("The Selling price of " + elektra.getModel()+" "+ eragon.getYear()+" Model with Discount is N"
                + elektra.calculatePriceWithDiscount());


    }
}
