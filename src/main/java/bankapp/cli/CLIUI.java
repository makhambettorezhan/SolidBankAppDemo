package bankapp.cli;

import bankapp.account.AccountType;
import org.springframework.stereotype.Service;

@Service
public interface CLIUI extends CreateAccountOperationUI, WithdrawDepositOperationCLIUI{
    public double requestClientAmount();

    public String requestClientAccountNumber();

    @Override
    public AccountType requestAccountType();
}
