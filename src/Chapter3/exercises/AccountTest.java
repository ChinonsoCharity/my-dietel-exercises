package Chapter3.exercises;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
displayAccount();
    }

public static void displayAccount(){
        Account userAccount = new Account();
    Scanner bank = new Scanner(System.in);

    System.out.println("Enter Account Name:");
    String userName = bank.next();
    userAccount.setName(userName);
    System.out.println(userAccount.displayAccount());

}
}
