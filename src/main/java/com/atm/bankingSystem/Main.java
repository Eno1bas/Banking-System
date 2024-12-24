package com.atm.bankingSystem;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        ATM atm = new ATM(account);

        if (atm.wasCorrectPINEntered()) {
            int selectedOption = atm.selectAnOption();
            switch (selectedOption) {
                case 1:
                    atm.withdraw();
                    break;
                case 2:
                    atm.displayBalance();
                    break;
                case 3:
                    System.out.println("Transaction Cancelled. Goodbye.");
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }

        CardReader cardReader = new CardReader();
        cardReader.ejectCard();
    }
}

