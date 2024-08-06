import java.util.Scanner;


public class Customer {
    private Server server;

    public Customer(Server server) {
        this.server = server;
    }

    public void handlePinInput() {
        Scanner scan = new Scanner(System.in);
        for (int attempts = 0; attempts < 3; attempts++) {
            System.out.println("Enter your PIN:");
            int pin = scan.nextInt();
            if (server.isPINValid(pin)){
              displayAccountBalance();
              return;
            } else {
                System.out.println("invalid PIN");
            }
        }
        System.out.println("Please try again in 24 hours");
    }
    public static void main(String[] args) {
        Server bank = new Server();
        Customer pinHandler = new Customer(bank);
        pinHandler.handlePinInput();
    }
    private void displayAccountBalance() {
        System.out.println("Account balance: " + server.getBalance());
    }
}
