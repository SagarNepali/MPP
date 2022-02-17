package prob4E.launch;

public class SavingsAccount extends  Account {

    private double interestRate;
    private double balance;
    private String acctId;


    public SavingsAccount(String acctId, double interestRate, double balance) {
        super();
        this.acctId = acctId;
        this.balance = balance;
        this.interestRate =interestRate;

    }

    @Override
    public String getAccountId() {
        return acctId;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double computeUpdatedBalance() {
        return balance + (interestRate * balance);
    }
}
