package banking.system;

// Savings account class extending Account and implementing Transactable

public class SavingsAccount extends Account implements Transactable {
    // TODO: Add private field for interestRate (double)
    private double interestRate;

    // TODO: Create constructor that takes accountNumber, initial balance, and interestRate
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // TODO: Implement getAccountType() to return "Savings"
    @Override
    String getAccountType() {
        return "Savings";
    }
    // TODO: Implement deposit() - add amount to balance and return true
    @Override
    public boolean deposit(double amount) {
        setBalance(getBalance() + amount);
        return true;
    }

    // TODO: Implement withdraw() - return false if amount exceeds balance, otherwise subtract and return true
    @Override
    public boolean withdraw(double amount) {
        if(getBalance()-amount<0){
        return false;}
        setBalance(getBalance() - amount);
        return true;
    }

    // TODO: Add applyInterest() method that increases balance by interest rate percentage
    @Override
    public void applyInterest(){
        setBalance(getBalance() + getBalance()*interestRate);
    }
}
