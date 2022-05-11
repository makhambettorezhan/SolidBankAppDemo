package bankapp;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TransactionWithdraw {
    private AccountWithdrawService accountWithdrawService;
    private TransactionDAO transactionDAO;

    public void execute(double amount, AccountWithdraw accountWithdraw) {

    }
}
