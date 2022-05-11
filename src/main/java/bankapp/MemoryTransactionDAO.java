package bankapp;

import java.util.ArrayList;
import java.util.List;

public class MemoryTransactionDAO implements TransactionDAO {
    private List<Transaction> transactions;

    public MemoryTransactionDAO() {
        transactions = new ArrayList<>();
    }
    @Override
    public List<Transaction> getTransactions() {
        return null;
    }

    @Override
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }
}
