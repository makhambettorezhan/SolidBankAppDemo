package bankapp;

public interface CLIUI extends CreateAccountOperationUI {
    public double requestClientAmount();

    public String requestClientAccountNumber();

    @Override
    public AccountType requestAccountType();
}
