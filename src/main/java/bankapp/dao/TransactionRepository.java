package bankapp.dao;

import bankapp.transaction.Transaction;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {
    @Modifying
    @Query("INSERT INTO TRANSACTION (id, transaction_type, client_id, account_id, balance)" +
            "VALUES (:transactionId, :deposit, :clientId, :accountId, :amount)")
    public void addTransaction(Long transactionId, String deposit, String clientId, Long accountId, double amount);
}
