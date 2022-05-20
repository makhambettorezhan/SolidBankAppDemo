package bankapp.transaction;

import bankapp.account.Account;
import bankapp.dao.TransactionRepository;
import bankapp.service.AccountDepositService;
import bankapp.service.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TransactionDeposit {
    private AccountDepositService accountDepositService;
    private TransactionRepository transactionRepository;

    private TransactionService transactionService;
    public void execute(double amount, Account accountDeposit) {

        accountDepositService.deposit(amount, accountDeposit);
        Long accountId = accountDeposit.getAccount_id();
        Long id = transactionService.getId();
        transactionRepository.addTransaction(id,"DEPOSIT", "1", accountId, amount);
        transactionService.increment();
    }
}
