package bankapp.service;

import bankapp.account.Account;
import bankapp.account.AccountType;
import bankapp.account.AccountWithdraw;
import bankapp.dao.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
@AllArgsConstructor
@Repository
public class AccountListingServiceImpl implements AccountListingService {
    private AccountRepository accountRepository;


    @Override
    public Account getClientAccount(String clientId, long accountId) {
        //return accountDAO.getClientAccount(clientId, accountId);
        return accountRepository.findById(accountId).get();
    }

    @Override
    public Account getClientWithdrawAccount(String clientId, Long accountId) {
        //return accountDAO.getClientWithdrawAccount(clientId, accountId);
        return accountRepository.findById(accountId).get();

    }

    @Override
    public Iterable<Account> getClientAccounts(String clientId) {
        return accountRepository.findAll();
    }

    @Override
    public List<Account> getClientAccountsByType(String clientId, AccountType accountType) {
        //return accountDAO.getClientAccountsByType(clientId, accountType);
        return null;
    }
}
