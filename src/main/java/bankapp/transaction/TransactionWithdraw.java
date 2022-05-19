package bankapp.transaction;

import bankapp.account.Account;
import bankapp.account.AccountWithdraw;
import bankapp.dao.TransactionDAO;
import bankapp.service.AccountWithdrawService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TransactionWithdraw {
    private AccountWithdrawService accountWithdrawService;
    private TransactionDAO transactionDAO;

    public void execute(double amount, Account accountWithdraw) {
        accountWithdrawService.withdraw(amount, accountWithdraw);
        transactionDAO.addTransaction(new Transaction("WITHDRAW", amount, accountWithdraw.getClientId()));
    }
}
