package DecoratorPattern;//Package name

public class SavingsAccount implements BankAccount {
    //Initiliaze data types
    private String accountName;
    private double balance;
    private Integer accountNumber;
    @Override//Enables setter
    public String showInfo() {
        return "Account number(s): " + accountNumber + "\nAccount name(s): " + accountName +
                "\nBalance(s): " + balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public String showAccountType() {
        return "Typical Account";
    }
    @Override//Enables getters
    public double getBalance() {
        return balance;
    }
    @Override
    public double getInterestRate() {
        return 0.01;
    }

    @Override
    public String showBenefits() {
        return "Typical Savings Account";
    }
    @Override
    public double computeBalanceWithInterest() {
        return balance * (1 + getInterestRate());
    }
}