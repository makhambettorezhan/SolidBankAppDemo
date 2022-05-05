package bankapp;

import java.util.List;

public class AccountBasicCLI {
    private CreateAccountOperationUI createAccountOperationUI;
    private BankCore bankCore;
    private AccountListingService accountListing;

    public AccountBasicCLI(CreateAccountOperationUI createAccountOperationUI, BankCore bankCore, AccountListingService accountListing) {
        this.createAccountOperationUI = createAccountOperationUI;
        this.bankCore = bankCore;
        this.accountListing = accountListing;
    }

    public void createAccountRequest(String clientId) {
        AccountType accountType = createAccountOperationUI.requestAccountType();
        bankCore.createNewAccount(accountType, clientId);
    }
    //CHANGE FROM THE PICTURE
    public void getAccounts(String clientId) {
        List<Account> accountList = this.accountListing.getClientAccounts(clientId);
        System.out.println("[");
        for(Account account: accountList) {
            System.out.println(account);
        }
        System.out.print("]");
    }
}
