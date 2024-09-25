public class CardReader {


    public boolean cardPresent (int PINCode){
    BankAccount account = new BankAccount();
        return account.validatePIN(PINCode);
    }
    public void correctPIN(int enteredPIN) {
        if (cardPresent(enteredPIN)) {
            System.out.println("PIN is correct.");
        } else {
            System.out.println("Invalid PIN. Please try again.");
        }
    };
}
