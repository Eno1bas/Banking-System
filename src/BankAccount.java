import java.util.Objects;

public class BankAccount {
    // Variables
    private float balance = 600000;
    private int pinCode = 1234;


    // Methods
    public float getBalance() {
        return balance;
    }

    public boolean validatePIN(int enteredPIN) {
        return Objects.equals(this.pinCode, enteredPIN);
    }

    public void receiveFunds(float receivedAmount){
       balance= balance+receivedAmount;
    }
    public void withdrawFunds(float withdrawnAmount){
       balance = balance-withdrawnAmount;
    }
    public void releaseFunds(float merchantAccount){
        balance = balance-merchantAccount;
    }
    public void sendFunds(float recipientAccount)
    {balance = balance-recipientAccount;}
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
