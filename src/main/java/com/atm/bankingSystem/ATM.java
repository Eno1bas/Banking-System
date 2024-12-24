package com.atm.bankingSystem;

import java.util.Scanner;

public class ATM {

    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public boolean wasCorrectPINEntered() {
        Scanner scanner = new Scanner(System.in);
        for (int attempt = 0; attempt < 3; attempt++) {
            System.out.println("Enter your PIN:");
            int enteredPIN = scanner.nextInt();
            if (bankAccount.isPINValid(enteredPIN)) {
                System.out.println("Correct Pin");
                return true;
            } else {
                System.out.println("Invalid PIN. Please try again.");
            }
        }
        System.out.println("Account locked. Please try again in 24 hours.");
        return false;
    }

    public void displayBalance() {
        System.out.println("Account balance: " + bankAccount.getBalance());
    }

    public int selectAnOption() {
        System.out.println("Please choose one of the following options");
        System.out.println("1. Withdraw");
        System.out.println("2. Check Balance");
        System.out.println("3. Cancel");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much do you wish to withdraw?");
        float withdrawnAmount = scanner.nextFloat();
        if (withdrawnAmount <= 0) {
            System.out.println("Invalid amount; please enter a valid amount.");
        } else if (withdrawnAmount > bankAccount.getBalance()) {
            System.out.println("Insufficient Funds; cannot withdraw more than your account balance.");
        } else {
            ATMDispensary atmDispensary = new ATMDispensary();
            if (atmDispensary.hasSufficientCash(withdrawnAmount)) {
                bankAccount.withdrawFunds(withdrawnAmount);
                atmDispensary.dispenseCash(withdrawnAmount);
                System.out.println("Dispensing £" + withdrawnAmount + "...");
                System.out.println("Transaction Successful. Take your card, funds to follow.");
            } else {
                System.out.println("Sorry, the ATM does not have enough cash.");
            }
        }
    }
}




































