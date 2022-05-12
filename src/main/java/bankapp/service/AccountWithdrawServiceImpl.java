package bankapp.service;

import bankapp.dao.AccountDAO;
import bankapp.account.AccountWithdraw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountWithdrawServiceImpl implements AccountWithdrawService {
    @Autowired
    private AccountDAO accountDAO;
    @Override
    public void withdraw(double amount, AccountWithdraw account) {
        double withdrawResult = account.getBalance()-amount;
        if(withdrawResult >= 0) {
            System.out.println(amount + "$ transferred from " + account.getId() + " account");
            accountDAO.updateAccount(account, account.getBalance()-amount);
        } else {
            System.out.println("Withdraw not possible: not enough money");
        }

    }
}
