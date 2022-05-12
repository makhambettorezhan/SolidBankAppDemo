package bankapp.cli;

import bankapp.account.Account;
import bankapp.service.AccountListingService;
import bankapp.account.AccountType;
import bankapp.BankCore;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@AllArgsConstructor
public class AccountBasicCLI {
    private CreateAccountOperationUI createAccountOperationUI;
    private BankCore bankCore;
    private AccountListingService accountListing;



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
        System.out.println("]");
    }
}
