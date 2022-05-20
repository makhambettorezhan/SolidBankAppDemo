package bankapp.service;

import bankapp.account.Account;
import bankapp.account.AccountType;
import bankapp.account.AccountWithdraw;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AccountListingService {

    public Account getClientAccount(String clientId, long accountId);

    public Account getClientWithdrawAccount(String clientId, Long accountId);

    public Iterable<Account> getClientAccounts(String clientId);

    public Iterable<Account> getClientAccountsByType(String clientId, AccountType accountType);

}
