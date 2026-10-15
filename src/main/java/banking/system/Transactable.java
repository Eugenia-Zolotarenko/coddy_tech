package banking.system;

// Interface defining the contract for financial operations

public interface Transactable {
    // TODO: Declare deposit method that takes amount and returns boolean
    boolean deposit(double amount);

    // TODO: Declare withdraw method that takes amount and returns boolean
    boolean withdraw(double amount);
}