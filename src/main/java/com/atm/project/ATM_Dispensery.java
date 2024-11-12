package com.atm.project;

public class ATM_Dispensery {
    private float cashAvailable = 60000f;

    public boolean hasSufficientCash(float amount) {
        return cashAvailable >= amount;
    }

    public void dispenseCash(float amount) {
        if (amount <= cashAvailable) {
            cashAvailable -= amount; // Deduct the amount from the available cash
        }
    }
}


