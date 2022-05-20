package bankapp.transaction;

import bankapp.account.Account;
import bankapp.dao.TransactionRepository;
import bankapp.service.AccountWithdrawService;
import bankapp.service.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TransactionWithdraw {
    private AccountWithdrawService accountWithdrawService;
    private TransactionRepository transactionRepository;
    private TransactionService transactionService;

    public void execute(double amount, Account accountWithdraw) {
        accountWithdrawService.withdraw(amount, accountWithdraw);
        Long accountId = accountWithdraw.getAccount_id();
        String clientId = accountWithdraw.getClientId();
        Long id = transactionService.getId();
        transactionRepository.addTransaction(id, "WITHDRAW", clientId, accountId, amount);
        transactionService.increment();
    }
}
