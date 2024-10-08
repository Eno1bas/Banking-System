import java.text.BreakIterator;
import java.util.PrimitiveIterator;
import java.util.Scanner;

public class ATM {
    // Variables
    private BankAccount bankAccount;

    // Constructor
    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        ATM atm = new ATM(account);
        atm.handlePINEntry();
        int selectedOption = atm.chooseOptions();
        if(selectedOption==1){
            atm.withdraw();
        }
        else if (selectedOption==2){
            atm.displayBalance();
        }
        else {
            System.out.println("Transaction Cancelled. Good bye.");
        }


    }
    // Methods
    public boolean correctPIN(int enteredPIN) {
        return bankAccount.validatePIN(enteredPIN);
    }
    public void handlePINEntry() {
        Scanner scanner = new Scanner(System.in);
        for (int attempt = 0; attempt < 3; attempt++) {
            System.out.println("Enter your PIN:");
            int enteredPIN = scanner.nextInt();
            if ((correctPIN(enteredPIN))) {
                System.out.println("Correct Pin");
                return;
            } else {
                System.out.println("Invalid PIN. Please try again.");
            }
        }
        System.out.println("Account locked. Please try again in 24 hours.");

    }

    private void displayBalance() {
        System.out.println("Account balance: " + bankAccount.getBalance());
    }

    private int chooseOptions() {
        System.out.println("Please choose one of the following options");
        System.out.println("1. Withdraw");
        System.out.println("2. Check Balance");
        System.out.println("3. Cancel");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private void withdraw(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("how much do you wish to withdraw");
        float withdrawnAmount = scanner.nextFloat();
        if (withdrawnAmount<=0){
            System.out.println("Invalid amount; please enter a valid amount");
            return;
        } else if (withdrawnAmount> bankAccount.getBalance()){
            System.out.println("Insufficient Funds, cannot withdraw more than your account balance");
            }
            else {//we have provided all information and all checks are passed, we can conclude user journey.
            ATM_Dispensery atm_dispensery = new ATM_Dispensery();
            if (atm_dispensery.hasSufficientCash(withdrawnAmount)) {
                bankAccount.withdrawFunds(withdrawnAmount);
                atm_dispensery.dispenseCash(withdrawnAmount);
                System.out.println("Dispensing £" + withdrawnAmount + "...");
                System.out.println("Transaction Successful. Take your card, Funds to follow.");

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