package BankApp;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JetAccountTest {
    private JetAccount jet = new JetAccount("Nonso Chima","2227");
    @Test
    public void jetAccountCanBeTested(){
        JetAccount jet = new JetAccount("Nonso Chima","2227");
        String jetAccountName = jet.getAccountName();
        assertEquals("Nonso Chima", jetAccountName);
    }

    @Test
    public void getJetAccountBalanceTest(){
        JetAccount jet = new JetAccount("Nonso Chima","2227");
        int balance = jet.getBalance("2227");
        assertEquals(50_000,balance);

    }
    @Test
    public void setJetAccountPinTest(){
        JetAccount jet = new JetAccount("Nonso Chima", "2227");
        jet.setPin("2345");
    }

    @Test
    public void setJetAccountNameTest(){
        JetAccount jet = new JetAccount("Nonso Chima","2227");
                jet.setAccountName("Jerry");
        String accountName = jet.getAccountName();
        assertEquals("Jerry",accountName);
    }
    @Test
    public void deposit5kBalanceIsTobe55kTest(){
//        given
//        when
        jet.deposit(5_000);
        //check
        int balance = jet.getBalance("2227");
        assertEquals(55_000,balance);

    }
    @Test
    public void negativeAmountNotToBeDepositedTest(){
        //when
        jet.deposit(-5_000);
        //check
        int balance = jet.getBalance("2227");
        assertEquals(50_000,balance);
    }
    @Test
    public void moreAmountCannotbewithdrawnTest(){
        //when
        jet.withdraw(55_000,"2227");
//        check
        int balance = jet.getBalance("2227");
        assertEquals(50_000,balance);
    }
    @Test
    public void withdrawingWithWrongPinTest(){
//        when
        jet.withdraw(30_000,"1234");
//        check
        int balance = jet.getBalance("2227");
        assertEquals(50_000,balance);
    }
}
