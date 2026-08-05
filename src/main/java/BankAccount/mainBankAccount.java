package BankAccount;

public class mainBankAccount {
    public static void main(String[] args) {
        String accountNumber = "ACC001";
        String ownerName = "John Doe";
        double depositAmount = 100.0;
        double withdrawAmount1 = 50.0;
        double withdrawAmount2 = 30.0;

        BankAccount bk = new BankAccount(accountNumber, ownerName);
        System.out.println("Deposit: " + bk.deposit(depositAmount));

        System.out.println("Withdraw 1: " + bk.withdraw(withdrawAmount1));
        System.out.println("Withdraw 2: " + bk.withdraw(withdrawAmount2));

        bk.getAccountSummary();
        System.out.println("*************************************");

         accountNumber = "ACC003";
         ownerName = "Bob Wilson";
         depositAmount = 1000.0;
         withdrawAmount1 = 0.0;
         withdrawAmount2 = 500.0;

        BankAccount bk1 = new BankAccount(accountNumber, ownerName);
        System.out.println("Deposit: " + bk1.deposit(depositAmount));

        System.out.println("Withdraw 1: " + bk1.withdraw(withdrawAmount1));
        System.out.println("Withdraw 2: " + bk1.withdraw(withdrawAmount2));
        bk1.getAccountSummary();
        System.out.println("*************************************");
    }
}
