package bankapp;

import lombok.AllArgsConstructor;

@AllArgsConstructor()
public class TransactionDepositCLI {
    private TransactionDeposit transactionDeposit;
    private WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;
    private AccountListingService accountListing;

    public void depositMoney(String clientId) {
        System.out.println("Type amount of Money to Deposit");
        double amount = withdrawDepositOperationCLIUI.requestClientAmount();
        String accountId = withdrawDepositOperationCLIUI.requestClientAccountNumber();
        transactionDeposit.execute(amount, accountListing.getClientAccount(clientId, accountId));
    }
}
