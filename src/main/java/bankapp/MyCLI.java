package bankapp;

import java.util.Scanner;

public class MyCLI implements CLIUI {
    private Scanner scanner;

    public MyCLI() {
        this.scanner = new Scanner(System.in);
    }

    public MyCLI(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public double requestClientAmount() {
        return 0;
    }

    @Override
    public String requestClientAccountNumber() {
        //String accountId = scanner.nextLine();
        //return accountId;
        return null;
    }

    @Override
    public AccountType requestAccountType() {
        System.out.println("Please enter an account type: ");
        String type = scanner.nextLine();
        return new AccountType(type);
    }
}
