package bankapp.service;

import bankapp.account.Account;
import bankapp.account.AccountWithdraw;
import bankapp.dao.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class AccountWithdrawServiceImpl implements AccountWithdrawService {
    @Autowired
    private AccountRepository accountRepository;
    @Override
    public void withdraw(double amount, Account account) {
        double withdrawResult = account.getBalance()-amount;
        if(withdrawResult >= 0) {
            String accountId  = String.format("%03d%06d", 1, Integer.parseInt(account.getAccount_id()+""));
            System.out.println(amount + "$ transferred from " + accountId + " account");
            account.setBalance(withdrawResult);
            accountRepository.save(account);
        } else {
            System.out.println("Withdraw not possible: not enough money");
        }

    }
}
