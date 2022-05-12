package bankapp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TransactionDeposit {
    private AccountDepositService accountDepositService;
    private TransactionDAO transactionDAO;

    public void execute(double amount, Account accountDeposit) {

        accountDepositService.deposit(amount, accountDeposit);
        transactionDAO.addTransaction(new Transaction("deposit", amount, accountDeposit.getId()));
    }
}
