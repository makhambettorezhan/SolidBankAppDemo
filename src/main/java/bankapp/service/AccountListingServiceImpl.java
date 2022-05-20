package bankapp.service;

import bankapp.account.Account;
import bankapp.account.AccountType;
import bankapp.dao.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Repository
public class AccountListingServiceImpl implements AccountListingService {
    private AccountRepository accountRepository;


    @Override
    public Account getClientAccount(String clientId, long accountId) {
        Optional<Account> account = accountRepository.findById(accountId);
        if(account.isPresent())
            return account.get();
        return null;
    }

    @Override
    public Account getClientWithdrawAccount(String clientId, Long accountId) {
        return accountRepository.findById(accountId).get();
    }

    @Override
    public Iterable<Account> getClientAccounts(String clientId) {
        return accountRepository.findAll();
    }

    @Override
    public List<Account> getClientAccountsByType(String clientId, AccountType accountType) {
        return null;
    }
    @Override
    public int getAccountsSize() {
        return accountRepository.getAccountRepositorySize();
    }
}
