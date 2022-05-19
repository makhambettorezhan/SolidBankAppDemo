package bankapp.dao;

import bankapp.account.Account;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

    //@Query("INSERT INTO ACCOUNT (account_id, account_type, client_id, balance, withdraw_allowed) values (":account"))
    //public void addAccount(Account account);

}
