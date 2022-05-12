package bankapp;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryAccountDAO implements AccountDAO {
    List<Account> accountList;

    public MemoryAccountDAO() {
        this.accountList = new ArrayList<>();
    }

    public MemoryAccountDAO(List<Account> accountList) {
        this.accountList = accountList;
    }

    @Override
    public List<Account> getClientAccounts(String clientId) {
        List<Account> clientAccounts = new ArrayList<>();
        for(Account account: accountList) {
            if(account.getClientId().equals(clientId)) {
                clientAccounts.add(account);
            }
        }
        return clientAccounts;
    }

    @Override
    public void createNewAccount(Account account) {
        accountList.add(account);
    }

    @Override
    public void updateAccount(Account account, double amount) {
        //account.setBalance(amount);
        for(Account a: accountList) {
            if(a.getId().equals(account.getId())) {
                a.setBalance(amount);
            }
        }
    }

    @Override
    public List<Account> getClientAccountsByType(String clientId, AccountType accountType) {
        List<Account> listOfClientAccountsByType = new ArrayList<>();
        for(Account account: accountList) {
            if(account.getClientId().equals(clientId)) {
                if(account.getAccountType().getType().equals(accountType.getType())) {
                    listOfClientAccountsByType.add(account);
                }
            }
        }
        return listOfClientAccountsByType;
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientId, String accountId) {
        for(Account account: accountList) {
            if(account.getClientId().equals(clientId)) {
                if(account.isWithdrawAllowed()) {
                    return null;
                }
            }
        }
        return null;
    }

    @Override
    public Account getClientAccount(String clientId, String accountId) {
        for(Account account: accountList) {
            if(account.getClientId().equals(clientId)) {
                if(account.getId().equals(accountId)) {
                    return account;
                }
            }
        }
        return null;
    }
}
