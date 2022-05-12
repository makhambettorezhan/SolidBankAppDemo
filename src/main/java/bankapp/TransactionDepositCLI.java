package bankapp;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor()
public class TransactionDepositCLI {
    private TransactionDeposit transactionDeposit;
    private WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;
    private AccountListingService accountListing;

    public void depositMoney(String clientId) {

        double amount = withdrawDepositOperationCLIUI.requestClientAmount();
        String accountId = withdrawDepositOperationCLIUI.requestClientAccountNumber();
        if(!accountId.isEmpty())
            transactionDeposit.execute(amount, accountListing.getClientAccount(clientId, accountId));
    }
}
