package bankapp;

public class AccountDepositServiceImpl implements AccountDepositService {
    private AccountDAO accountDAO;
    @Override
    public void deposit(double amount, Account account) {
        System.out.println(amount + "$ transferred to " + account.getId() + " account");
        accountDAO.updateAccount(account, account.getBalance()+amount);
    }
}
