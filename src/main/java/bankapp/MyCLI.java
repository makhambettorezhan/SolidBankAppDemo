package bankapp;

import java.util.Arrays;
import java.util.List;
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
        System.out.println("Choose account type");
        System.out.println("[CHECKING, SAVING, FIXED]");
        String type = scanner.nextLine();
        List<String> types = Arrays.asList("CHECKING", "SAVING", "FIXED");
        if(!types.contains(type)) { // checks whether the right type is selected
            System.out.println("You have entered invalid type");
            return null;
        }
        return new AccountType(type);
    }
}
