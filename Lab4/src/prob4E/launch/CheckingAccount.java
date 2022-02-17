package prob4E.launch;

public class CheckingAccount extends Account {

    private double monthlyFee;
    private double balance;
    private String acctId;


    public CheckingAccount(String acctId, double monthlyFee, double balance) {
        super();
        this.acctId = acctId;
        this.balance = balance;
        this.monthlyFee = monthlyFee;

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
        return balance - monthlyFee;
    }
}
