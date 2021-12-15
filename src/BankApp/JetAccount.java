package BankApp;

public class JetAccount {
    private String name;
    private String jetPin ="2227";
    private int balance;
    public JetAccount(String accountName, String pin) {
        name = accountName;
        jetPin = pin;
    }

    public JetAccount() {

    }

    public String getAccountName() {
        return name;
    }

    public int getBalance(String pin){
        if(pin.equals(jetPin))
        return balance;
        return 0;
    }


    public int deposit(int amount) {
        if(amount>0)balance = balance + amount;
        return balance;
    }
    public void withdraw(int amount,String pin) {
        if(pin.equals(jetPin)){
            if(amount<=balance && amount > 0)
                balance = balance - amount;
        }
    }

}
