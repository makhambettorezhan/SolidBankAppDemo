package bankapp;

import org.springframework.stereotype.Service;

@Service
public interface AccountWithdrawService {
    public void deposit(double amount, AccountWithdraw account);
}
