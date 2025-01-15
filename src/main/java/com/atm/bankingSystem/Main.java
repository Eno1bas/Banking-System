package com.atm.bankingSystem;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        ATM atm = new ATM(account);
        atm.startATM();

        CardReader cardReader = new CardReader();
        cardReader.ejectCard();
    }
}

