package Chapter3.exercises;

public class Car {
    private String model;
    private int year;
    private double price;
    private int discount;
    private double discountAmount;
    private double discountedPrice;

    public void setModel(String modelName) {
        model = modelName;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int modelYear) {
        year = modelYear;
    }

    public int getYear() {
        return year;
    }

    public void setPrice(double modelPrice) {
        price = modelPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPercentageDiscount(int percentageDiscount) {
        discount = percentageDiscount;
    }
    public int getPercentageDiscount(){
        return discount;
    }

    public double calculateDiscountAmount() {
        return discountAmount = price * discount / 100;
    }
    public double calculatePriceWithDiscount(){
        return discountedPrice = price - (price * discount/100);
    }
}
