package bankapp.account;

import lombok.*;
import org.springframework.data.annotation.Id;
@Data
@Builder
@AllArgsConstructor
public class Account {
    private @Id Long account_id;

    private String accountType;
    private String clientId;
    private double balance;
    private int withdrawAllowed;


}
