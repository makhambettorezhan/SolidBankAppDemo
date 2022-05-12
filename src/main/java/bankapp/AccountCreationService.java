package bankapp;

import org.springframework.stereotype.Service;

@Service
public interface AccountCreationService {

    public void create(AccountType accountType, long bankId, String clientId, long accountId);

}
