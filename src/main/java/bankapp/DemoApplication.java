package bankapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		AccountDAO accountDAO = new MemoryAccountDAO();
		CreateAccountOperationUI createAccountOperationUI = new MyCLI();
		AccountCreationService accountCreationService = new AccountCreationServiceImpl(accountDAO);
		AccountListingService accountListingService = new AccountListingServiceImpl(accountDAO);

		BankCore bankCore = new BankCore(accountCreationService);
		AccountBasicCLI accountBasicCLI = new AccountBasicCLI(createAccountOperationUI, bankCore, accountListingService);

		accountBasicCLI.createAccountRequest("1");
		accountBasicCLI.createAccountRequest("1");
		accountBasicCLI.createAccountRequest("1");

		accountBasicCLI.getAccounts("1");

	}

}
