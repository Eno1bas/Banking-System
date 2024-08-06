import java.util.Objects;

public class Server {
    private float customerBalance = 600000;
    private int customerPIN = 1234;


    public float getBalance (){
        return customerBalance;
    }

    public boolean isPINValid(int PIN) {
        return Objects.equals(this.customerPIN, PIN);

    }

}
