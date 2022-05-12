package bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDepositServiceImpl implements AccountDepositService {
    @Autowired
    private AccountDAO accountDAO;
    @Override
    public void deposit(double amount, Account account) {
        System.out.println(amount + "$ transferred to " + account.getId() + " account");
        accountDAO.updateAccount(account, account.getBalance()+amount);
    }
}
