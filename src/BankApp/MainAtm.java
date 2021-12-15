package BankApp;

import java.util.Scanner;

public class MainAtm {
    public static void main(String[] args) {

        String prompt = """
                WELCOME TO COPTIC BANK LTD
                wetin you want do sef?
                Press 1 to Create Account
                Press 2 to Exit
                """;
        System.out.println(prompt);
        Scanner akkant = new Scanner(System.in);//Account User
        int accountUser = akkant.nextInt();
        switch (accountUser) {
            case 1:
                akkant.nextLine();
                System.out.println("Shebi you wan Create Account");
                System.out.println("Oya give ya Name");
                String name = akkant.nextLine();
                System.out.println("Oya give ya Pin");
                String pin = akkant.nextLine();
                JetAccount userAccount = new JetAccount(name, pin);
                System.out.println("\nWe don Create am\n");


                int newUserResponse;
                    String newAccountPrompt = """
                            Press 1 to Deposit
                            Press 2 to Withdraw
                            Press 3 to Check Balance
                            Press 4 to Go Back
                            Press 5 If You don tire
                            """;

                    System.out.println(newAccountPrompt);
                    newUserResponse = akkant.nextInt();
                    switch (newUserResponse) {
                        case 1:
                            System.out.println("Oya how much wan put for your Account");
                            int amount = akkant.nextInt();
                            userAccount.deposit(amount);
                            System.out.println("\nOya We don Put yo Moni");
                            break;
                        case 2:
                            akkant.nextLine();
                            System.out.println("Oya how much you commot from ya Account");
                            int amountWithdrawal = akkant.nextInt();
                            System.out.println("Oya Enter that your Secret Pin");
                            String userPin = akkant.nextLine();
                            userAccount.withdraw(amountWithdrawal, userPin);
                            System.out.println("\nOya We don commot Your Moni");
                            break;
                        case 3:
                            akkant.nextLine();
                            System.out.println("Oya wetin be Your Secret Pin");
                            String checkPin = akkant.nextLine();
                            int userBalance = userAccount.getBalance(checkPin);
                            System.out.println("Your Account Balance is " + userBalance);
                            break;
                        case 4:
//                          do to implement go back
                            break;
                        case 5:
                            System.exit(0);
                    }

    }
        }
    }
