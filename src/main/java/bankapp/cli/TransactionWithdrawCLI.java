package bankapp.cli;

import bankapp.service.AccountListingService;
import bankapp.account.AccountWithdraw;
import bankapp.transaction.TransactionWithdraw;
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
        AccountWithdraw accountWithdraw = null;

        if(!accountId.isEmpty())
            accountWithdraw = accountListing.getClientWithdrawAccount(clientId, accountId);

        if(accountWithdraw != null)
            transactionWithdraw.execute(amount, accountWithdraw);
        else
            System.out.println("withdraw NOT allowed on FIXED account");
    }
}
