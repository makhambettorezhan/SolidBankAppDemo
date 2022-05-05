package bankapp;

import java.util.List;

public class AccountListingServiceImpl implements AccountListingService {
    private AccountDAO accountDAO;

    @Override
    public Account getClientAccount(String clientId, String accountId) {
        return null;
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientId, String accountId) {
        return null;
    }

    @Override
    public List<Account> getClientAccounts(String clientId) {
        return null;
    }

    @Override
    public List<Account> getClientAccountsByType(String clientId, AccountType accountType) {
        return null;
    }
}
