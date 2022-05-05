package bankapp;

public class BankCore {
    private static long id = 1;
    private long lastAccountNumber = 1;
    private AccountCreationService accountCreation;

    public BankCore(AccountCreationService accountCreation) {
        this.accountCreation = accountCreation;
    }

    public void createNewAccount(AccountType accountType, String clientId) {
        //accountCreation.create(accountType, id, clientId, id);
    }

    private void incrementLastAccountNumber() {
        lastAccountNumber++;
    }
}
