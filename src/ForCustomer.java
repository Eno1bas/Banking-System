import java.util.Scanner;


public class ForCustomer {
    private Bank_BE2 bank;

    public ForCustomer(Bank_BE2 bank) {
        this.bank = bank;
    }

    public void handlePinInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your PIN:");
        String pin = scan.nextLine();
        bank.login(pin);
    }
    public static void main(String[] args) {
        Bank_BE2 bank = new Bank_BE2();
        ForCustomer pinHandler = new ForCustomer(bank);
        pinHandler.handlePinInput();
    }
}
