package banking.system;

// Abstract base class representing any bank account

public abstract class Account implements Transactable{
    // TODO: Add private fields for accountNumber (String) and balance (double)
    private String accountNumber;
    private double balance;

    // TODO: Create constructor that initializes accountNumber and balance
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    // TODO: Add getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }
    // TODO: Add getter for balance
    public double getBalance() {
        return balance;
    }

    // TODO: Add protected setter for balance (so subclasses can modify it)
    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // TODO: Declare abstract method getAccountType() that returns String
    abstract String getAccountType();

    // TODO: Implement getDetails() method
    // Should return "[accountNumber] ([accountType]): $[balance]" with balance formatted to 2 decimal places
    public String getDetails() {
        // TODO: Implement this
        return String.format("%s (%s): $%.2f", accountNumber, getAccountType(), balance);
    }
    public void applyInterest(){

    }
}
