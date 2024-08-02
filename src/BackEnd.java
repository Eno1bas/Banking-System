public class BackEnd {
    private float accountBalance = 600000;
    private String userPIN = "1234";
    private int attempts = 0;

    public float getBalance (){
        return accountBalance;
    }

    public boolean isPINValid(String PIN) {
        if (this.userPIN.equals(PIN)) {
            return true;
        } else return false;

    }

    public int getAttempts() {
        return attempts;
    }
}
