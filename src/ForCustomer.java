import java.util.Scanner;


public class ForCustomer {
    private BackEnd backEnd;

    public ForCustomer(BackEnd backEnd) {
        this.backEnd = backEnd;
    }

    public void handlePinInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your PIN:");
        String pin = scan.nextLine();
        backEnd.isPINValid(pin);
        if (backEnd.isPINValid(pin)){
          displayAccountBalance();
        } else {
            System.out.println("invalid PIN");
            handlePinInput();
        }
    }
    public static void main(String[] args) {
        BackEnd bank = new BackEnd();
        ForCustomer pinHandler = new ForCustomer(bank);
        pinHandler.handlePinInput();
    }
    private void displayAccountBalance() {
        System.out.println("Account balance: " + backEnd.getBalance());
    }
}
