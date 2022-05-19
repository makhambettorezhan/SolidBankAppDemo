package bankapp.service;

import bankapp.account.Account;
import bankapp.account.AccountType;
import bankapp.dao.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class AccountCreationServiceImpl implements AccountCreationService {
    /*private AccountDAO accountDAO;*/
    private AccountRepository accountRepository;
    @Override
    public void create(AccountType accountType, long bankId, String clientId, long accountId) {
        if(accountType != null) {
            //String accountNumber = String.format("%03d%06d", bankId, accountId);
            boolean isWithdrawAllowed = true;
            if(accountType.getType().equals("FIXED"))
                isWithdrawAllowed = false;

            Account account = new Account(accountId, accountType.getType(), clientId, 0, 0);
            System.out.println("Bank account created successfully");
            accountRepository.save(account);

        }
    }
}
