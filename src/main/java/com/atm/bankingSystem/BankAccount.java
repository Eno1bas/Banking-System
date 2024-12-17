package com.atm.bankingSystem;

import java.util.Objects;

public class BankAccount {
    private float balance = 600000;
    private int PINCode = 1234;
    // Methods
    public float getBalance() {
        return balance;
    }

    public boolean isPINValid(int enteredPIN) {
        return Objects.equals(this.PINCode, enteredPIN);
    }

    public void withdrawFunds(float withdrawnAmount){
       balance = balance-withdrawnAmount;
    }

    public void depositFunds(float depositAmount){
        balance = balance+depositAmount;
    }
}































