package bankapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("props.xml");


		//AccountDAO accountDAO = new MemoryAccountDAO();
		//CreateAccountOperationUI createAccountOperationUI = new MyCLI();
		//AccountCreationService accountCreationService = new AccountCreationServiceImpl(accountDAO);
		//AccountListingService accountListingService = new AccountListingServiceImpl(accountDAO);
		//BankCore bankCore = new BankCore(accountCreationService);
		//AccountBasicCLI accountBasicCLI = new AccountBasicCLI(createAccountOperationUI, bankCore, accountListingService);

		/* NOT NEEDED - FOR CONVENIENCE ONLY
		AccountDAO accountDAO = (MemoryAccountDAO) context.getBean("accountDAO");
		CreateAccountOperationUI createAccountOperationUI = (CreateAccountOperationUI) context.getBean("myCLI");
		AccountCreationService accountCreationService = (AccountCreationServiceImpl) context.getBean("accountCreationServiceImpl");
		AccountListingService accountListingService = (AccountListingServiceImpl) context.getBean("accountListingServiceImpl");
		BankCore bankCore = (BankCore) context.getBean("bankCore");
		*/

		AccountBasicCLI accountBasicCLI = (AccountBasicCLI) context.getBean("accountBasicCLI");

		printHelp();


		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();

		while(choice != 7) {
			switch (choice) {
				case 1:
					accountBasicCLI.getAccounts("1");
					break;
				case 2:
					accountBasicCLI.createAccountRequest("1");
					break;
				case 6:
					printHelp();
					break;
				case 7:
					return;
				default:
					System.out.println("Error: invalid command");
			}
			choice = input.nextInt();
		}
		System.out.println("Application closed");
	}

	public static void printHelp() {
		System.out.println("Welcome to CLI bank serviceEnter operation number:\n" +
				"1 - show accounts\n" +
				"2 - create account\n" +
				"3 - deposit\n" +
				"4 - withdraw\n" +
				"5 - transfer\n" +
				"6 - this message\n" +
				"7 - exit\n");
	}
}
