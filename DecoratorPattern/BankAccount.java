package DecoratorPattern;
public interface BankAccount {
    //Calls necessary data types
    String showAccountType();
    double getInterestRate();
    double getBalance();
    String showBenefits();
    double computeBalanceWithInterest();
    String showInfo();
}