package bankapp.service;

import bankapp.account.Account;
import bankapp.dao.AccountRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class AccountRemoveServiceImpl implements AccountRemoveService {

    private AccountRepository accountRepository;
    @Override
    public void deleteAccountById(Long accountId) {
        accountRepository.deleteAccountById(accountId);
    }
}
