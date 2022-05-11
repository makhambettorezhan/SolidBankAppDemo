package bankapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public CreateAccountOperationUI myCLI() {
        return new MyCLI();
    }

    @Bean
    public AccountDAO accountDAO() {
        return new MemoryAccountDAO();
    }

    @Bean
    public AccountCreationService accountCreationService() {
        return new AccountCreationServiceImpl(accountDAO());
    }

    @Bean
    public AccountListingService accountListingService() {
        return new AccountListingServiceImpl(accountDAO());
    }

    @Bean
    public BankCore bankCore() {
        return new BankCore(accountCreationService());
    }

    @Bean
    public AccountBasicCLI accountBasicCLI() {
        return new AccountBasicCLI(myCLI(), bankCore(), accountListingService());
    }
}
