package bankapp;

public class AccountDepositServiceImpl implements AccountDepositService {
    private AccountDAO accountDAO;
    @Override
    public void deposit(double amount, Account account) {

        accountDAO.updateAccount(account, account.getBalance()+amount);
    }
}
