package bankapp.service;

import bankapp.account.AccountWithdraw;
import org.springframework.stereotype.Service;

@Service
public interface AccountWithdrawService {
    public void withdraw(double amount, AccountWithdraw account);
}
