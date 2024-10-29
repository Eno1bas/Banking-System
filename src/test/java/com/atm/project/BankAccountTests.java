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

    }

    // hint: AssertTrue
    @Test
    public void correctPINisAccepted(){

    }

    @Test
    public void wrongPINisNotAccepted(){

    }
}
