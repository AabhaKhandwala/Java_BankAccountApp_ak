public class Savings extends Account {
    // List properties specific to the savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    // Constructor to initialize saving account properties
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setsafetyDepositBox();

    }

    @Override
    public void setRate() {
        rate = getBaseRate() - 0.25;

    }

    private void setsafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));

    }

    // List any methods specific to the saving account
    public void showInfo() {
        System.out.println("ACCOUNT TYPE: savings");
        super.showInfo();
        System.out.println("Your Savings Account Features: " + "\n Safety Deposit Box ID: " + safetyDepositBoxID
                + "\n Safety Deposit Box Key: " + safetyDepositBoxKey);
    }

}