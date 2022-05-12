package bankapp.dao;

import bankapp.account.Account;
import bankapp.account.AccountType;
import bankapp.account.AccountWithdraw;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AccountDAO {
    public List<Account> getClientAccounts(String clientId);

    public void createNewAccount(Account account);

    public void updateAccount(Account account, double amount);

    public List<Account> getClientAccountsByType(String clientId, AccountType accountType);

    public AccountWithdraw getClientWithdrawAccount(String clientId, String accountId);

    public Account getClientAccount(String clientId, String accountId);
}
