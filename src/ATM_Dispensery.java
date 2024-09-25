public class ATM_Dispensery {
    private float availableCash = 60000f;




    public boolean hasSufficientCash(float amount) {
        return availableCash >= amount;
    }


    public void dispenseCash(float amount) {
        if (amount <= availableCash) {
            availableCash -= amount; // Deduct the amount from the available cash
        }
    }


    public float getAvailableCash() {
        return availableCash;
    }
}


