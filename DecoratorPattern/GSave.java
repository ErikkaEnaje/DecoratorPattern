package DecoratorPattern;//GSave Extend Decorator

public class GSave implements BankAccountDecorator {
    private BankAccount bankAccount;
    @Override
    public double getInterestRate() {//gets interest
        return 0.025;
    }
    @Override
    public double getBalance() {//retrieves balance
        return bankAccount.getBalance();
    }
    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + ", GCashSave Transfer";//Make transfer
    }
    @Override
    public double computeBalanceWithInterest() {
        return bankAccount.getBalance() * (1 + getInterestRate());
    }
    @Override
    public String showAccountType() {//Enables account option
        return "GCashSave";
    }
    @Override//Implements setter
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }
    public GSave(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

}