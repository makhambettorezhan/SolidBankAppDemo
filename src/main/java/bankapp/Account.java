package bankapp;

public class Account {
    private AccountType accountType;
    private String id;
    private String clientId;
    private double balance;
    private boolean withdrawAllowed;

    public Account(AccountType accountType, String id, String clientId, double balance, boolean withdrawAllowed) {
        this.accountType = accountType;
        this.id = id;
        this.clientId = clientId;
        this.balance = balance;
        this.withdrawAllowed = withdrawAllowed;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public String getId() {
        return id;
    }

    public String getClientId() {
        return clientId;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isWithdrawAllowed() {
        return withdrawAllowed;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setWithdrawAllowed(boolean withdrawAllowed) {
        this.withdrawAllowed = withdrawAllowed;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountType=" + accountType.getType() +
                ", id='" + id + '\'' +
                ", clientId='" + clientId + '\'' +
                ", balance=" + balance +
                '}';
    }
}
