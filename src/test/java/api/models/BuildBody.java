package api.models;

import api.models.post.*;

public class BuildBody {
    Offer offer = new Offer();
    PersonalInfo personalInfo = new PersonalInfo();
    Address address = new Address();
    BankInfo bankInfo = new BankInfo();
    IncomeInfo incomeInfo = new IncomeInfo();
    EmploymentInfo employmentInfo = new EmploymentInfo();

    public Offer offerBody(String ssn) {
        offer.setProduction(false);
        offer.setLanguage("en");
        offer.setCurrency("USD");
        offer.setCampaignId("11-50-newhope");
        offer.setSocialSecurityNumber(ssn);
        offer.setLeadOfferId("20160912-21EC2020-3AEA-4069-A2DD-08002B30309D");
        offer.setEmail("test_customer@gmail.com");
        offer.setStateCode("FL");
        offer.setGrossMonthlyIncome(2800);
        offer.setPersonalInfo(personalInfoBody());
        offer.setBankInfo(bankInfoBody());
        offer.setIncomeInfo(incomeInfoBody());
        offer.setEmploymentInfo(employmentInfoBody());
        offer.setRequestedLoanAmount(1500);

        return offer;
    }

    public Offer offerBody(String ssn, int income, String state) {
        offer.setProduction(false);
        offer.setLanguage("en");
        offer.setCurrency("USD");
        offer.setCampaignId("11-50-newhope");
        offer.setSocialSecurityNumber(ssn);
        offer.setLeadOfferId("20160912-21EC2020-3AEA-4069-A2DD-08002B30309D");
        offer.setEmail("test_customer@gmail.com");
        offer.setStateCode(state);
        offer.setGrossMonthlyIncome(income);
        offer.setPersonalInfo(personalInfoBody());
        offer.setBankInfo(bankInfoBody());
        offer.setIncomeInfo(incomeInfoBody());
        offer.setEmploymentInfo(employmentInfoBody());
        offer.setRequestedLoanAmount(1500);

        return offer;
    }

    public PersonalInfo personalInfoBody() {
        personalInfo.setFirstName("Jane");
        personalInfo.setLastName("Smith");
        personalInfo.setDateOfBirth("19451009");
        personalInfo.setAddress(addressBody());
        personalInfo.setMobilePhone("3224340098");
        personalInfo.setHomePhone("4523452232");

        return personalInfo;
    }

    public Address addressBody() {
        address.setStreetAddress("123 Main Street");
        address.setCity("Miami");
        address.setZip("33125");
        address.setCountryCode("US");

        return address;
    }

    public BankInfo bankInfoBody() {
        bankInfo.setBankName("Chase");
        bankInfo.setAbaRoutingNumber("123456789");
        bankInfo.setAccountNumber("012345789");
        bankInfo.setAccountType(1);
        bankInfo.setAccountLength(6);

        return bankInfo;
    }

    public IncomeInfo incomeInfoBody() {
        incomeInfo.setIncomeType("Employment");
        incomeInfo.setPayrollType("DirectDeposit");
        incomeInfo.setPayrollFrequency(1);
        incomeInfo.setLastPayrollDate("20160915");

        return incomeInfo;
    }

    public EmploymentInfo employmentInfoBody() {
        employmentInfo.setEmployerName("ToysRUs");
        employmentInfo.setHireDate("20110516");

        return employmentInfo;
    }
}
