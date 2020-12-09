import java.util.Random;
public class BankAccount {
    public static int numAccounts = 0;
    public static double totalHoldings = 0;
    private static String generated() {
        String subst = "";
        Random r = new Random();
        for(int i = 0; i < 10; i++) {
            susbt += r.nextInt(10);
        }
        return subst;
    }
    private String accountNumber;
    private double checkingBalance;
    private double savingBalance;
    
    public BankAccount() {
        BankAccount.numAccounts += 1;
        this.checkingBalance = 0;
        this.savingBalance = 0;
        this.accountNumber = BankAccount.generated();
    }
    public double getChekingBalance() {
        return this.checkingBalance;
    }
    public double getSavingBalance() {
        return this.savingBalance;
    }
    public void depositeMoney(double amount, String account) {
        if(account.equals("savings"))
            this.savingBalance += amount;
        else if(account.equals("checking"))
            this.checkingBalance += amount;
        BankAccount.totalHoldings += amount;
    }
    public void withdrawMoney(double amount, String account) {
        boolean successful = false;
        if(account.equals("savings")) {
            if(this.savingBalance - amount >= 0) {
                successful = true;
                this.savingBalance -= amount;
            }
        }
        else if(account.equals("checking")) {
            if(this.checkingBalance - amount >= 0) {
                successful = true;
                this.checkingBalance -= amount;
            }
        }
        if(successful) {
            BankAccount.totalHoldings -= amount;
        }
    }
    public static void maain(String[] args) {
        BankAccount ba = new BankAccount();
        ba.depositeMoney(100.49, "checking");
        ba.depositeMoney(3.00, "savings");
        ba.displayAccountBalance();

        System.out.println(BankAccount.totalHoldings);

        ba.withdrawMoney(50, "checking");
        ba.withdrawMoney(50, "savings");
        ba.displayAccountBalance();

        System.out.println(BankAccount.totalHoldings);
    }


}
