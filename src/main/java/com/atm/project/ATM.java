package com.atm.project;

import java.util.Scanner;

public class ATM {
    // Variables
    private BankAccount bankAccount;
    // Constructor
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

    public int selectedOptions() {
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
            ATM_Dispensery atmDispensery = new ATM_Dispensery();
            if (atmDispensery.hasSufficientCash(withdrawnAmount)) {
                bankAccount.withdrawFunds(withdrawnAmount);
                atmDispensery.dispenseCash(withdrawnAmount);
                System.out.println("Dispensing £" + withdrawnAmount + "...");
                System.out.println("Transaction Successful. Take your card, funds to follow.");
            } else {
                System.out.println("Sorry, the ATM does not have enough cash.");
            }
        }
    }
}





































//import java.util.Scanner;


//public class Customer {
    //private Server server;

    //public Customer(Server server) {
       // this.server = server;
   // }

   // public void handlePinInput() {
       // Scanner scan = new Scanner(System.in);
       // for (int attempts = 0; attempts < 3; attempts++) {
        //    System.out.println("Enter your PIN:");
        //    int pin = scan.nextInt();
        //    if (server.isPINValid(pin)) {
         //       displayAccountBalance();
          //      return;
          //  } else {
          //      System.out.println("invalid PIN");
         //   }
       // }
       // System.out.println("Please try again in 24 hours");
    //}

   // public static void main(String[] args) {
     //   Server bank = new Server();
     //   Customer pinHandler = new Customer(bank);
     //   pinHandler.handlePinInput();
   // }

   // private void displayAccountBalance() {
       // System.out.println("Account balance: " + server.getBalance());
   // }
//}