package Day2;

/**
 * This application
 */
public class BankAccount {

    //States
    //Get but not set
    private String accountNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    //Get and set both allowed
    String accountHolderName;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    //Get and set both allowed
    private String accountType;

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    //Get and set both allowed
    private String connectedMobileNumber;

    public String getConnectedMobileNumber() {
        return connectedMobileNumber;
    }

    public void setConnectedMobileNumber(String connectedMobileNumber) {
        this.connectedMobileNumber = connectedMobileNumber;
    }

    //Get and set both allowed
    private String address;


    //Get and set both allowed
    private String bsbNumber;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBsbNumber() {
        return bsbNumber;
    }

    public void setBsbNumber(String bsbNumber) {
        this.bsbNumber = bsbNumber;
    }

    //Get and set both allowed
    private double accountBalance;

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    //Set but not get
    private String socialSecurityNumber;

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    //Behaviour
    /*
    Open Account
    Close Account
    Deposit
    Withdraw
    Transfer
    */
}
