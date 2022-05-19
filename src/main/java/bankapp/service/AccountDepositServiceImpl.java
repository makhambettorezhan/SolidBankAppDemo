package bankapp.service;

import bankapp.account.Account;
import bankapp.dao.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class AccountDepositServiceImpl implements AccountDepositService {

    private AccountRepository accountRepository;
    @Override
    public void deposit(double amount, Account account) {
        System.out.println(amount + "$ transferred to " + account.getAccount_id() + " account");
        account.setBalance(account.getBalance()+amount);
        accountRepository.save(account);
    }
}
