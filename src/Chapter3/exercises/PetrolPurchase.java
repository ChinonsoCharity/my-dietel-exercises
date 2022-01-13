package Chapter3.exercises;

public class PetrolPurchase {
    private String name;
    private String location;
    private String type;
    private int quantity;
    private double discount;
    private double netAmount;
    private double purchaseAmount;
    private double discountAmount;
    private double discountedTotalAmount;

    public void setStationName(String stationName) {
        name = stationName;
    }
    public String getStationName() {
        return name;
    }
    public void setStationLocation(String stationLocation){
        location = stationLocation;
    }
    public String getStationLocation(){
        return location;
    }
    public void setType(String petrolType) {
        type = petrolType;
    }
    public String getType() {
        return type;
    }
    public void setQuantity(int quantityLitres) {
        quantity = quantityLitres;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setPercentageDiscount(double percentageDiscount){
        discount = percentageDiscount;
    }
    public double getPercentageDiscount(){
        return discount;
    }
    public void discountedUnitPrice(double discountPrice){
      discountAmount = discountPrice;
    }
    public double calculateDiscountedPrice(){
       return discountAmount  = purchaseAmount * discount / 100;
    }
    public void setNetAmount(double netPrice){
        netAmount = netPrice;
    }
    public double getNetAmount() {
        return netAmount;
    }
    public void purchaseAmount(double totalAmount){
      purchaseAmount =totalAmount;
    }
    public double calculatePurchaseAmount(){
       return purchaseAmount = quantity * netAmount ;
    }
    public void totalAmountWithDiscount(double discountedTotal){
        discountedTotalAmount = discountedTotal;
    }
    public double calculateDiscountedTotal(){
        return discountedTotalAmount = purchaseAmount - discountAmount;
    }

}

