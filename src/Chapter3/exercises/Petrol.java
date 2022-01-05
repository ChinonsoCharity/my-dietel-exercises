package Chapter3.exercises;

import java.util.Scanner;

public class Petrol {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        PetrolPurchase petrol = new PetrolPurchase();
        System.out.println("Enter the Station Name");
        String userName = user.nextLine();
        petrol.setStationName(userName);
        System.out.printf("Welcome to %s Petrol Station",petrol.getStationName());
        System.out.println();
        System.out.println("Enter Station Location");
        String userLocation = user.nextLine();
        petrol.setStationLocation(userLocation);
        System.out.println("This Station is located at "+petrol.getStationLocation());
        System.out.println("Enter the Petrol Type");
        String userType = user.nextLine();
        petrol.setType(userType);
        System.out.println("Required Petrol Type is "+ petrol.getType());
        System.out.println("Enter the quantity of Petrol");
        int userQuantity = user.nextInt();
        petrol.setQuantity(userQuantity);
        System.out.printf("Required Quantity is %d Liters %n",petrol.getQuantity());

        System.out.println("Enter the Unit price");
        double userPrice = user.nextDouble();
        petrol.setNetAmount(userPrice);
        System.out.println("Enter Discount Percentage");
        double userDiscount = user.nextDouble();
        petrol.setPercentageDiscount(userDiscount);
        System.out.println("The Price per Liter is N" +petrol.getNetAmount());
        System.out.println("The Total price is  " + petrol.calculatePurchaseAmount());
        System.out.println("The Discount Price is " +petrol.calculateDiscountedPrice());
        System.out.printf("The Total price with discount for %d Liters of %s is %.2f",userQuantity,userType,petrol.calculateDiscountedTotal());
    }
}
