package bankapp;

import org.springframework.stereotype.Service;

@Service
public interface AccountWithdrawService {
    public void withdraw(double amount, AccountWithdraw account);
}
