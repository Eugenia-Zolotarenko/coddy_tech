package banking.system;

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        String input = "SAVINGS:SAV001:1000.00:0.05,CHECKING:CHK001:500.00:200.00,DEPOSIT:SAV001:250.00,WITHDRAW:CHK001:600.00,TRANSFER:SAV001:CHK001:100.00,INTEREST:SAV001";
        input = "SAVINGS:S001:500.00:0.10";
        input = "CHECKING:C001:100.00:50.00,WITHDRAW:C001:150.00";
        input = "SAVINGS:S001:1000.00:0.03,INTEREST:S001";
        input = "CHECKING:C001:200.00:100.00,WITHDRAW:C001:350.00";
        input = "SAVINGS:S001:500.00:0.05,SAVINGS:S002:300.00:0.08,TRANSFER:S001:S002:200.00";
        input = "SAVINGS:S001:100.00:0.05,CHECKING:C001:50.00:25.00,TRANSFER:S001:C001:150.00";
        input = "SAVINGS:SAV001:2000.00:0.02,CHECKING:CHK001:1000.00:500.00,DEPOSIT:SAV001:500.00,DEPOSIT:CHK001:250.00,WITHDRAW:SAV001:1000.00,WITHDRAW:CHK001:1500.00,INTEREST:SAV001";
        input = "CHECKING:C001:0.00:1000.00,DEPOSIT:C001:500.00,WITHDRAW:C001:1400.00,WITHDRAW:C001:200.00";
        input = "SAVINGS:A001:1000.00:0.05,SAVINGS:A002:2000.00:0.03,CHECKING:A003:500.00:100.00,TRANSFER:A001:A002:500.00,TRANSFER:A002:A003:1000.00,INTEREST:A001,INTEREST:A002,DEPOSIT:A003:200.00";

        // TODO: Create a Bank instance
        ArrayList<Account> accounts = new ArrayList<>();
        Bank bank = new Bank(accounts);

        // TODO: Split input by comma to get individual commands
        String[] commands = input.split(",");

        // TODO: Process each command:
        // - SAVINGS:accountNumber:balance:interestRate -> Create SavingsAccount, print "Account created: [accountNumber]"
        // - CHECKING:accountNumber:balance:overdraftLimit -> Create CheckingAccount, print "Account created: [accountNumber]"
        // - DEPOSIT:accountNumber:amount -> Deposit and print "Deposited $[amount] to [accountNumber]"
        // - WITHDRAW:accountNumber:amount -> Withdraw and print success or "Withdrawal failed: [accountNumber]"
        // - TRANSFER:fromAccount:toAccount:amount -> Transfer and print success or "Transfer failed: [exception message]"
        // - INTEREST:accountNumber -> Apply interest and print "Interest applied to [accountNumber]"
        for (String command : commands) {
            String[] lines = command.split(":");
            String accountNumber = lines[1];
            switch (lines[0]) {
                case "SAVINGS" -> {
                    double balance = Double.parseDouble(lines[2]);
                    double interestRate = Double.parseDouble(lines[3]);
                    Account savingsAccount = new SavingsAccount(accountNumber, balance, interestRate);
                    bank.addAccount(savingsAccount);
                    System.out.println("Account created: " + accountNumber);
                }
                case "CHECKING" -> {
                    double balance = Double.parseDouble(lines[2]);
                    double overdraftLimit = Double.parseDouble(lines[3]);
                    Account checkingAccount = new CheckingAccount(accountNumber, balance, overdraftLimit);
                    bank.addAccount(checkingAccount);
                    System.out.println("Account created: " + accountNumber);
                }
                case "DEPOSIT" -> {
                    double amount = Double.parseDouble(lines[2]);
                    Account account = bank.findAccount(accountNumber);
                    account.deposit(amount);
                    System.out.printf("Deposited $%.2f to %s\n", amount, accountNumber);
                }
                case "WITHDRAW" -> {
                    double amount = Double.parseDouble(lines[2]);
                    Account account = bank.findAccount(accountNumber);
                    if (account.withdraw(amount)){
                        System.out.printf("Withdrew $%.2f from %s\n",amount, accountNumber);
                    }
                    else {
                        System.out.println("Withdrawal failed: " + accountNumber);
                    }
                }
                case "TRANSFER" -> {
                    double amount = Double.parseDouble(lines[3]);
                    try {
                        bank.transfer(accountNumber, lines[2], amount);
                        System.out.printf("Transferred $%.2f from %s to %s\n",amount, accountNumber, lines[2]);
                    } catch (InsufficientFundsException e) {
                        System.out.println("Transfer failed: " + e.getMessage());
                    }
                }
                case "INTEREST" -> {
                    bank.findAccount(accountNumber).applyInterest();
                    System.out.println("Interest applied to " + accountNumber);
                }
                default -> System.out.println("Invalid command");
            }
        }

        // TODO: After all commands, print "--- Bank Summary ---"
        System.out.println("--- Bank Summary ---");

        // TODO: Print each account's details using getDetails()
        for (Account account : accounts){
            System.out.println(account.getDetails());
        }

        // TODO: Print "Total deposits: $[total]" formatted to 2 decimal places
        System.out.printf("Total deposits: $%.2f", bank.getTotalDeposits());
    }
}

