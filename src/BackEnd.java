public class BackEnd {
    private float accountBalance = 600000;
    private String userPIN = "1234";

    public float getBalance (){
        return accountBalance;
    }

    public boolean isPINValid(String PIN) {
        if (this.userPIN.equals(PIN)) {
            return true;
        } else return false;
    }

}
