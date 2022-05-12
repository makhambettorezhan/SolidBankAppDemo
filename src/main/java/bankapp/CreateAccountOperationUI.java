package bankapp;

import org.springframework.stereotype.Service;

@Service
public interface CreateAccountOperationUI {
    public AccountType requestAccountType();
}
