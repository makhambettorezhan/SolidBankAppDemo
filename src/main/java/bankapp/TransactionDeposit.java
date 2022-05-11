package bankapp;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TransactionDeposit {
    private AccountDepositService accountDepositService;
    private TransactionDAO transactionDAO;

    public void execute(double amount, Account accountDeposit) {

        accountDepositService.deposit(amount, accountDeposit);
        transactionDAO.addTransaction(new Transaction("deposit", amount, accountDeposit.getId()));
    }
}
