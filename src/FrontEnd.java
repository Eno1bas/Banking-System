import java.util.Scanner;


public class FrontEnd {
    private BackEnd backEnd;

    public FrontEnd(BackEnd backEnd) {
        this.backEnd = backEnd;
    }

    public void handlePinInput() {
        Scanner scan = new Scanner(System.in);
        for (int attempts = 0; attempts < 3; attempts++) {
            System.out.println("Enter your PIN:");
            String pin = scan.nextLine();
            if (backEnd.isPINValid(pin)){
              displayAccountBalance();
              return;
            } else {
                System.out.println("invalid PIN");
            }
        }
        System.out.println("Please try again in 24 hours");
    }
    public static void main(String[] args) {
        BackEnd bank = new BackEnd();
        FrontEnd pinHandler = new FrontEnd(bank);
        pinHandler.handlePinInput();
    }
    private void displayAccountBalance() {
        System.out.println("Account balance: " + backEnd.getBalance());
    }
}
