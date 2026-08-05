package BankAccount;

class BankAccount {
    // TODO: Declare an immutable (final) account number
    private final String accountNumber;

    // TODO: Declare a private balance initialized to 0.0
    private double  balance = 0.0;

    // TODO: Declare a private owner name
    private String ownerName;

    // TODO: Create a constructor that takes accountNumber and ownerName

    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }

    // TODO: Create a getter for account number

    public String getAccountNumber() {
        return accountNumber;
    }

    // TODO: Create a getter for owner name

    public String getOwnerName() {
        return ownerName;
    }

    // TODO: Create a getter for balance

    public double getBalance() {
        return balance;
    }

    // TODO: Create deposit method that returns true if amount is positive, false otherwise
    // Only add to balance if amount is positive
    public boolean deposit(double amount){
        if(amount>0){
            this.balance += amount;
            return true;
        }
        else return false;
    }

    // TODO: Create withdraw method that returns true if amount is positive AND sufficient funds exist
    // Only subtract from balance if conditions are met
    public boolean withdraw(double amount){
        if(amount>0 && this.balance>=amount){
            this.balance -= amount;
            return true;
        } else return false;
    }

    // TODO: Create getAccountSummary method
    // Return format: "Account [accountNumber] | Owner: [ownerName] | Balance: $[balance]"
    // Use String.format("%.2f", balance) for formatting balance to 2 decimal places
    public void getAccountSummary(){
        System.out.printf("Account %s | Owner: %s | Balance: $%.2f\n",
                this.accountNumber, this.ownerName, this.balance);
    }
}
