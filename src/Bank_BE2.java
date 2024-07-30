public class Bank_BE2 {
    private float accountBalance = 600000;
    private String passcode = "1234";

    private void displayAccountBalance() {
        System.out.println("Account balance: " + accountBalance);
    }

    public void login(String passcode) {
        if (this.passcode.equals(passcode)) {
            displayAccountBalance();
        } else {
            System.out.println("Invalid PIN");
        }
    }

}
