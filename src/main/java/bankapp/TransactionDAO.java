package bankapp;

import java.util.List;

public interface TransactionDAO {
    public List<Transaction> getTransactions();

    public void addTransaction(Transaction transaction);
}
