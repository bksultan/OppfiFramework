package api.models.post;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IncomeInfo {
    private String incomeType;
    private String payrollType;
    private int payrollFrequency;
    private String lastPayrollDate;
}
