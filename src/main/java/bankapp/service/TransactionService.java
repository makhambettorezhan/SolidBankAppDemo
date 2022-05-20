package bankapp.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
public class TransactionService {
    private Long id = 0l;


    public void increment() {
        this.id++;
    }
}
