package bankapp.account;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
@Getter
@Setter
public class Account {
    private AccountType accountType;
    private String id;
    private String clientId;
    private double balance;
    private boolean withdrawAllowed;



    @Override
    public String toString() {
        return "Account{" +
                "accountType=" + accountType.getType() +
                ", id='" + id + '\'' +
                ", clientId='" + clientId + '\'' +
                ", balance=" + balance +
                '}';
    }
}
