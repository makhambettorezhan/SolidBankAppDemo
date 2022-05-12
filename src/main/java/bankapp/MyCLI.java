package bankapp;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
@Repository
@Getter
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
        System.out.println("Type amount of Money: ");
        return scanner.nextDouble();
    }

    @Override
    public String requestClientAccountNumber() {
        System.out.println("Type account ID: ");
        String accountId = scanner.next();
        return accountId;
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
