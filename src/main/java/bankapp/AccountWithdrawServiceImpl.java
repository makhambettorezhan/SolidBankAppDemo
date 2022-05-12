package bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountWithdrawServiceImpl implements AccountWithdrawService {
    @Autowired
    private AccountDAO accountDAO;
    @Override
    public void withdraw(double amount, AccountWithdraw account) {
        System.out.println(amount + "$ transferred from " + account.getId() + " account");
        accountDAO.updateAccount(account, account.getBalance()-amount);
    }
}
