public class Checking extends Account {
    // List properties specific to a checking account
    private int debitcardNumber;
    private int debitcardPIN;

    // Constructor to initialize cheking account properties
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();

    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;

    }

    private void setDebitCard() {
        debitcardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitcardPIN = (int) (Math.random() * Math.pow(10, 4));
    }

    // List any methods specific to the checking account
    public void showInfo() {
        System.out.println("ACCOUNT TYPE: checking");
        super.showInfo();
        System.out.println("Your Checking Account Features: " + "\nDebit card Number: " + debitcardNumber
                + "\nDebit card PIN: " + debitcardPIN);

    }
}