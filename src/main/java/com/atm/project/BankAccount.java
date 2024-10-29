package com.atm.project;

import java.util.Objects;

public class BankAccount {
    // Variables
    private float balance = 600000;
    private int pinCode = 1234;


    // Methods
    public float getBalance() {
        return balance;
    }

    public boolean isPINValid(int enteredPIN) {
        return Objects.equals(this.pinCode, enteredPIN);
    }


    public void withdrawFunds(float withdrawnAmount){
       balance = balance-withdrawnAmount;
    }

}
































//import java.util.Objects;

//public class Server {
  //  private float customerBalance = 600000;
  //  private int customerPIN = 1234;


   // public float getBalance (){
       // return customerBalance;
   // }

  //  public boolean isPINValid(int PIN) {
       // return Objects.equals(this.customerPIN, PIN);

    //}

//}