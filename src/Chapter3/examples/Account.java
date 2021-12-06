package Chapter3.examples;

public class Account {
    private String accountName;
    private int balance;

    public Account(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    private void setAccountName(String newName) {
        accountName = newName;
    }

    public void withdrawal(int amount){
        balance = balance+amount;
    }
    public int checkBalance(){return balance;}
}

///    RULES OF METHODS
////    1 and 2 cannot work
//    public void deposit(int amount){
//        balance=balance+amount;
//        setAccountName("Moji");
////        2 can work
//        public static void staticMethodAndStaticVariable(){
//            bankName ="Diamond Access"
//        }
////        3 can work
//        public void instanceMethodAndStaticVariable(String newName){
//            accountName = newname;
//            bankName = "GT CO";
//        }
////        5 can work
//        public String getAccountName(){
//            return accountName;
//        }
