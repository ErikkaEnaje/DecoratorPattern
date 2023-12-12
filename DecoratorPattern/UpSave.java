package DecoratorPattern;

public class UpSave implements BankAccountDecorator {
    //UpSave Implements Decorator
    private BankAccount bankAccount;
    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }//Implements getters and setters
    @Override
    public double getInterestRate() {
        return 0.04;
    }
    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    @Override
    public String showAccountType() {
        return "UpSaving(s)";
    }
    @Override
    public double getBalance() {
        return bankAccount.getBalance();
    }
    @Override//Prints insurance benefits
    public String showBenefits() {
        return bankAccount.showBenefits() + ", With-Insurance(s)";
    }
    public UpSave(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    @Override
    public double computeBalanceWithInterest() {
        return bankAccount.getBalance() * (1 + getInterestRate());
    }
}