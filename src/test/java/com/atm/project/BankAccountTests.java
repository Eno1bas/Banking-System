package com.atm.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTests {

    private final BankAccount bankAccount = new BankAccount();

    @Test
    public void balanceIsReducedOnWithdraw(){

        bankAccount.withdrawFunds(20000);
        float actualBalance = bankAccount.getBalance();
        float expectedBalance = 580000;

        assertEquals(expectedBalance, actualBalance);
    }

    // Implement Deposit before implementing this test
    @Test
    public void balanceIsIncreasedOnDeposit(){
        bankAccount.depositFunds(20000);
        float actualBalance = bankAccount.getBalance();
        float expectedBalance = 620000;

        assertEquals(expectedBalance, actualBalance);
    }

    // hint: AssertTrue
    @Test
    public void correctPINisAccepted(){
        boolean expectedPIN = bankAccount.isPINValid(1234);

        assertTrue(expectedPIN);
    }

    @Test
    public void wrongPINisNotAccepted(){
        boolean expectedPIN =! bankAccount.isPINValid(2346);

        assertTrue(expectedPIN);
    }
}
