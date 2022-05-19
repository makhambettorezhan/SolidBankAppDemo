package bankapp.transaction;

import bankapp.account.Account;
import bankapp.dao.TransactionDAO;
import bankapp.service.AccountDepositService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TransactionDeposit {
    private AccountDepositService accountDepositService;
    private TransactionDAO transactionDAO;

    public void execute(double amount, Account accountDeposit) {

        accountDepositService.deposit(amount, accountDeposit);
        transactionDAO.addTransaction(new Transaction("deposit", amount, "1"));
    }
}
