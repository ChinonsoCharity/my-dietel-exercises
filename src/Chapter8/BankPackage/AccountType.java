package Chapter8.BankPackage;

public enum AccountType {
    Saving(0.25),
    Teens(2.3), 
    Current(0.01);

    public double getInterestRate() {
        return interestRate;
    }

    private final double interestRate;
    AccountType(double interestRate){
        this.interestRate = interestRate;
    }
}
