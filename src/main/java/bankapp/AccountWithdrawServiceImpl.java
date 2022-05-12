package bankapp;

import org.springframework.stereotype.Repository;

@Repository
public class AccountWithdrawServiceImpl implements AccountWithdrawService {
    private AccountDAO accountDAO;
    @Override
    public void deposit(double amount, AccountWithdraw account) {

    }
}
