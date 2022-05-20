package bankapp.account;

import lombok.*;
import org.springframework.data.annotation.Id;
@Data
@AllArgsConstructor
public class Account {
    private @Id Long account_id;

    private String accountType;
    private String clientId;
    private double balance;
    private int withdrawAllowed;

    @Override
    public String toString() {
        String accountNumber = String.format("%03d%06d", 1, Integer.parseInt(this.getAccount_id()+""));

        return "Account{" +
                "account_id=" + accountNumber +
                ", accountType='" + accountType + '\'' +
                ", clientId='" + clientId + '\'' +
                ", balance=" + balance +
                ", withdrawAllowed=" + withdrawAllowed +
                '}';
    }
}
