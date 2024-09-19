public class ATM_Dispensery {
    private float availableCash = 60000f;

    // Constructor to initialize the ATM with a certain amount of cash
    public ATM_Dispensery(float initialCash) {
        this.availableCash = initialCash;
    }


    public boolean hasSufficientCash(float amount) {
        return availableCash >= amount;
    }


    public void dispenseCash(float amount) {
        if (amount <= availableCash) {
            availableCash -= amount; // Deduct the amount from the available cash
            System.out.println("Dispensing £" + amount + "...");
        } else {
            System.out.println("Sorry, the ATM does not have enough cash.");
        }
    }


    public float getAvailableCash() {
        return availableCash;
    }
}


