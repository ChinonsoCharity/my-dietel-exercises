package Chapter3.exercises;

public class Account {
    private String name;
    private double balance = 0;
    private String displayAccount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void deposit(int amount){
        if (amount < 0)
        balance = balance + amount;
    }
    public void withdrawal(int amount){
        if (amount < balance)
        balance = balance - amount;
    }
    public String displayAccount(){
        displayAccount = getName()+"'s Balance is N" +getBalance();
        return displayAccount;
    }




    }