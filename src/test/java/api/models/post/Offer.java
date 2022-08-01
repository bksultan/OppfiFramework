package api.models.post;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Offer<E> {
    private boolean isProduction;
    private String language;
    private String currency;
    private String campaignId;
    private String socialSecurityNumber;
    private String leadOfferId;
    private String email;
    private String stateCode;
    private int grossMonthlyIncome;

    private PersonalInfo personalInfo;
    private BankInfo bankInfo;
    private IncomeInfo incomeInfo;
    private EmploymentInfo employmentInfo;

    private int requestedLoanAmount;

}
