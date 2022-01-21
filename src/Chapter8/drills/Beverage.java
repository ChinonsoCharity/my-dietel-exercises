package Chapter8.drills;

public class Beverage {
    private int cocoaQty;
    private int sugarQty;
    private int milkQyt;

    //all arg constructor
    public Beverage(int cocoaQty, int sugarQty, int milkQyt) {
        this.cocoaQty = cocoaQty;
        this.sugarQty = sugarQty * 2;
        this.milkQyt = milkQyt;
    }

    // No arg constructor
    public Beverage(){
        //here we can define what happen in the constructor
        sugarQty = 5;
    }

    public int getCocoaQty() {
        return cocoaQty;
    }

    public void setCocoaQty(int cocoaQty) {
        this.cocoaQty = cocoaQty;
    }

    public int getSugarQty() {
        return sugarQty;
    }

    public void setSugarQty(int sugarQty) {
        this.sugarQty = sugarQty;
    }

    public int getMilkQyt() {
        return milkQyt;
    }

    public void setMilkQyt(int milkQyt) {
        this.milkQyt = milkQyt;
    }

    public Beverage(int cocoaQty,int milkQyt){
        this.cocoaQty = cocoaQty;
        this.milkQyt = milkQyt;
}
// calling a constructor in a constructor
    public Beverage(int milkQyt){
       this(0,milkQyt);
    }

}