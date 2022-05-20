package bankapp.transaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@Getter
@Setter
public class Transaction {
    private @Id Long id;
    private String type; // transaction type either DEPOSIT or WITHDRAW
    private String clientId;
    private double amount;
    private Long accountId;

}
