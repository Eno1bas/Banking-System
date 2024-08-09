import java.util.Scanner;

public class ATM {
    // Variables
    private BankAccount bankAccount;

    // Constructor
    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    // Methods
    public void handlePINEntry() {
        Scanner scanner = new Scanner(System.in);
        for (int attempt = 0; attempt < 3; attempt++) {
            System.out.println("Enter your PIN:");
            int enteredPIN = scanner.nextInt();
            if (bankAccount.validatePIN(enteredPIN)) {
                displayBalance();
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

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        ATM atm = new ATM(account);
        atm.handlePINEntry();
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