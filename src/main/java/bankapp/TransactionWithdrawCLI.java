package bankapp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TransactionWithdrawCLI {
    private TransactionWithdraw transactionWithdraw;
    private WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;
    private AccountListingService accountListing;

    public void withdrawMoney(String clientId) {
        double amount = withdrawDepositOperationCLIUI.requestClientAmount();
        String accountId = withdrawDepositOperationCLIUI.requestClientAccountNumber();
        if(!accountId.isEmpty())
            transactionWithdraw.execute(amount, accountListing.getClientWithdrawAccount(clientId, accountId));
    }
}
