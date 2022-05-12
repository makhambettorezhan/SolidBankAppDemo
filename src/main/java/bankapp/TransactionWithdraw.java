package bankapp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TransactionWithdraw {
    private AccountWithdrawService accountWithdrawService;
    private TransactionDAO transactionDAO;

    public void execute(double amount, AccountWithdraw accountWithdraw) {
        accountWithdrawService.withdraw(amount, accountWithdraw);
        transactionDAO.addTransaction(new Transaction("WITHDRAW", amount, accountWithdraw.getId()));
    }
}
