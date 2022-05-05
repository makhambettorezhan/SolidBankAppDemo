package bankapp;

public class AccountCreationServiceImpl implements AccountCreationService {
    private AccountDAO accountDAO;

    public AccountCreationServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void create(AccountType accountType, long bankId, String clientId, long accountId) {
        Account account = new Account(accountType, accountId+"", clientId, 0, false);
        accountDAO.createNewAccount(account);
    }
}
