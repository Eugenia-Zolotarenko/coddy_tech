package banking.system;

// Custom exception for insufficient funds

public class InsufficientFundsException extends Exception {
    // TODO: Create constructor that accepts attempted amount and current balance
    // TODO: Create message in format: "Insufficient funds: attempted [amount], available [balance]"


    public InsufficientFundsException(double amount, double balance) {
        // TODO: Call super() with the formatted message

           super(String.format("Insufficient funds: attempted %.2f, available %.2f\n", amount, balance));
    }
}
