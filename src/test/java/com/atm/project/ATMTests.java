package com.atm.project;

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
}



