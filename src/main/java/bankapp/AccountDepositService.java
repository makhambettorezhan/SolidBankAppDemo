package bankapp;

import org.springframework.stereotype.Service;

@Service
public interface AccountDepositService {
    public void deposit(double amount, Account accountWithdraw);
}
