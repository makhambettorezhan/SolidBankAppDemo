package bankapp.dao;

import bankapp.account.Account;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {


    @Modifying
    @Query(
            "INSERT INTO ACCOUNT (account_id, account_type, client_id, balance, withdraw_allowed) " +
                    "values (:accountId, :type, :clientId, :balance, :isWithdrawAllowed)"
    )
    void addAccount(long accountId, String type, String clientId, double balance, int isWithdrawAllowed);

    @Query("select COUNT(a.account_id) from ACCOUNT a")
    public int getAccountRepositorySize();
}
