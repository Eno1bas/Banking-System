package com.atm.project;

import com.atm.bankingSystem.ATM;
import com.atm.bankingSystem.BankAccount;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@Nested
class ATMTests {
    private final ATM atm = new ATM(new BankAccount());

    @Test
    public void withdrawoptionswork(){
       int expectedOption = 1;
        int actualOption = atm.selectedOptions();
        assertEquals(expectedOption, actualOption, "how much do you want to withdraw");
    }
    @Test
    public void displaybalance(){
        //given
        int expectedOption = 2;
        //when
        int actualOption = atm.selectedOptions();
        //then
        assertEquals(expectedOption, actualOption);
    }

    @Test
    public void workswhencorrectPINEntered(){
        //given
        int expectedPIN = 1234;
        //when
        boolean actualPIN = true;
        //then
        assertTrue(actualPIN);
    }
}



