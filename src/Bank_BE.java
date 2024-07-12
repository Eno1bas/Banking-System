public class Bank_BE {
    private float accountbalance= 600000;
    private String passcode= "12345";

    private void displaybalance () {
        System.out.println("Account balance: "+ accountbalance);
    }

    public void login(String passcode) {

        if (this.passcode.equals(passcode)) {
            System.out.println(accountbalance);
        } else
            System.out.println("invalid passcode");
    }

    }
