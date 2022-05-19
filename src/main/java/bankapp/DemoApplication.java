package bankapp;

import bankapp.cli.AccountBasicCLI;
import bankapp.cli.MyCLI;
import bankapp.cli.TransactionDepositCLI;
import bankapp.cli.TransactionWithdrawCLI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

import java.util.Scanner;

@SpringBootApplication
@EnableJdbcRepositories
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class);
	}
	@Override
	public void run(String... arg0) throws Exception {

		String clientId = "1";
		AccountBasicCLI accountBasicCLI = context.getBean(AccountBasicCLI.class);
		MyCLI myCLI = context.getBean(MyCLI.class);
		TransactionDepositCLI transactionDepositCLI = context.getBean(TransactionDepositCLI.class);
		TransactionWithdrawCLI transactionWithdrawCLI = context.getBean(TransactionWithdrawCLI.class);

		Scanner input = new Scanner(System.in);
		printHelp();
		boolean running = true;
		Scanner scanner = myCLI.getScanner();
		while(running) {
			switch (scanner.nextLine()) {
				case "1":
					accountBasicCLI.getAccounts(clientId);
					break;
				case "2":
					accountBasicCLI.createAccountRequest(clientId);
					break;
				case "3":
					transactionDepositCLI.depositMoney(clientId); break;
				case "4":
					transactionWithdrawCLI.withdrawMoney(clientId); break;
				case "6":
					printHelp();
					break;
				case "7":
					System.out.println("Application closed");
					running = false;
					break;
				default:
					System.out.println("Error: invalid command");
			}
			//scanner.close();
		}
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
