package com.atm.bankingSystem;

public class ATMDispensary {
    private float cashAvailable = 60000f;

    public boolean hasSufficientCash(float amount) {
        return cashAvailable >= amount;
    }

    public void dispenseCash(float amount) {
        if (amount <= cashAvailable) {
            cashAvailable -= amount;
        }
    }
}


