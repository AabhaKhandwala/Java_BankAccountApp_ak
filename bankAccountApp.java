import java.util.LinkedList;
import java.util.List;

public class bankAccountApp {
    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();
        /*
         * Checking check1 = new Checking("Tom Willson", "321654789", 1500); Savings
         * save1 = new Savings("Rich Millre", "123654987", 2000); * save1.compound();
         * check1.showInfo(); System.out.println("-----------------"); save1.showInfo();
         */

        // Read a CSV File then new accounts based on that data
        String file = "C:\\Users\\aabha\\Desktop\\WIN\\JAVA\\Assignment\\0522\\BankAccount.app\\original.csv";
        List<String[]> newAccountHolders = CSV.read(file);
        for (String[] accountHolder : newAccountHolders) {
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            System.out.println(name + " " + sSN + " " + accountType + " " + "$" + initDeposit);
            if (accountType.equals("Savings")) {
                // System.out.println("OPEN SAVINGS ACCOUNT");
                accounts.add(new Savings(name, sSN, initDeposit));
            } else if (accountType.equals("Checking")) {
                // System.out.println("OPEN A CHECKING ACCOUNT");
                accounts.add(new Checking(name, sSN, initDeposit));
            } else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }

        for (Account acc : accounts) {
            System.out.println("\n**********************");
            acc.showInfo();
        }

    }
}