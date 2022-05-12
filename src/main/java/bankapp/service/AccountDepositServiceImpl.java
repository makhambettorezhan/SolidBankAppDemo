package bankapp.service;

import bankapp.account.Account;
import bankapp.dao.AccountDAO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class AccountDepositServiceImpl implements AccountDepositService {
    @Autowired
    private AccountDAO accountDAO;
    @Override
    public void deposit(double amount, Account account) {
        System.out.println(amount + "$ transferred to " + account.getId() + " account");
        accountDAO.updateAccount(account, account.getBalance()+amount);
    }
}