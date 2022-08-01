package api.models.post;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BankInfo {
    private String bankName;
    private String abaRoutingNumber;
    private String accountNumber;
    private int accountType;
    private int accountLength;
}
