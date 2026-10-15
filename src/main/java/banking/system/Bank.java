package banking.system;

import java.util.ArrayList;

// Bank class that manages accounts

public class Bank {
    // TODO: Add ArrayList to store accounts
    ArrayList<Account> accounts;

    // TODO: Create constructor that initializes the ArrayList
    public Bank(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    // TODO: Implement addAccount(Account account) - adds account to the bank
    public void addAccount(Account account){
        accounts.add(account);
    }

    // TODO: Implement findAccount(String accountNumber) - returns Account or null if not found
    public Account findAccount(String accountNumber){
        for (Account account: accounts){
            if (account.getAccountNumber().equals(accountNumber))
                return account;
        }
        return null;
    }

    // TODO: Implement transfer(String fromAccount, String toAccount, double amount)
    // Should throw InsufficientFundsException if source has insufficient funds
    // On success, return "Transferred $[amount] from [fromAccount] to [toAccount]"
    public String transfer(String fromAccount, String toAccount, double amount) throws InsufficientFundsException {

        for (Account fromAcc: accounts){
            if(fromAcc.getAccountNumber().equals(fromAccount)){
                if(fromAcc.getBalance()<amount){
                    throw new InsufficientFundsException(amount, fromAcc.getBalance());
                } else {
                    for (Account toAcc: accounts){
                        if(toAcc.getAccountNumber().equals(toAccount)){
                            fromAcc.setBalance(fromAcc.getBalance() - amount);
                            toAcc.setBalance(toAcc.getBalance() + amount);

                            return String.format("Transferred $%.2f from %s to %s", amount, fromAccount, toAccount);
                        }
                    }
                }
            }
        }return null; // TODO: Implement this
    }

    // TODO: Implement getTotalDeposits() - returns sum of all account balances
    public double getTotalDeposits(){
        double sum = 0;
        for (Account account : accounts){
            sum += account.getBalance();
        }
        return sum;
    }

    // TODO: Add method to get all accounts for printing summary
    public  void allAccountsSummary(){
        for(Account account: accounts){
            System.out.println(account.getDetails());
        }
    }

}
