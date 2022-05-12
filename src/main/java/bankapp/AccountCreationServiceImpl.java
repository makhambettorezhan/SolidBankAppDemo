package bankapp;

import org.springframework.stereotype.Repository;

@Repository
public class AccountCreationServiceImpl implements AccountCreationService {
    private AccountDAO accountDAO;

    public AccountCreationServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void create(AccountType accountType, long bankId, String clientId, long accountId) {
        if(accountType != null) {
            String accountNumber = String.format("%03d%06d", bankId, accountId);
            Account account = new Account(accountType, accountNumber, clientId, 0, true);
            System.out.println("Bank account created");
            accountDAO.createNewAccount(account);
        }
    }
}
