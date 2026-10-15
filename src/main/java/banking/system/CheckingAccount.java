package banking.system;

// Checking account class extending Account and implementing Transactable

public class CheckingAccount extends Account  {
    // TODO: Add private field for overdraftLimit (double)
    private double overdraftLimit;

    // TODO: Create constructor that takes accountNumber, initial balance, and overdraftLimit
    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }
    // TODO: Implement getAccountType() to return "Checking"
    @Override
    String getAccountType() {
        return "Checking";
    }

    // TODO: Implement deposit() - add amount and return true
    @Override
    public boolean deposit(double amount) {
        setBalance(getBalance() + amount);
        return true;
    }

    // TODO: Implement withdraw() - allow if amount <= balance + overdraftLimit, return false otherwise
        @Override
        public boolean withdraw(double amount) {
            if(amount <= getBalance() + overdraftLimit) {
                setBalance(getBalance() - amount);
                return true;
            }
            return false;
        }
}
