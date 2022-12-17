import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {

        try (Scanner scnr = new Scanner(System.in)) {
            Bank bank = new Bank();
            for (;;) {
                System.out.println(
                        "1 - Open Account\n2 - List Accounts\n3 - Deposit funds\n4 - Withdraw funds\n5 - Close an account\n6 - Exit\n\nPlease enter your choice:");
                int choice = scnr.nextInt();

                if (choice == 1) {
                    scnr.nextLine();
                    System.out.println("Enter first name: ");
                    String firstName = scnr.nextLine();

                    System.out.println("Enter last name: ");
                    String lastName = scnr.nextLine();

                    System.out.println("Enter social security number: ");
                    String socialSecurityNumber = scnr.nextLine();

                    System.out.println("Account Name: ");
                    String accountName = scnr.nextLine();

                    Customer customer = new Customer(firstName, lastName, socialSecurityNumber);
                    AccountC account = new AccountC();
                    account.setCustomer(customer);
                    account.setAccountName(accountName);
                    bank.addAccount(account);

                } 
                else if (choice == 2) {
                    bank.listAccounts();
                } 
                else if (choice == 3) {
                    System.out.println("Enter account number: ");
                    int accountNumber = scnr.nextInt();
                    System.out.println("Enter the amount to deposit: ");
                    double accountDeposit = scnr.nextDouble();

                    bank.depositAccount(accountNumber, accountDeposit);

                } 
                else if (choice == 4) {
                    System.out.println("Enter account number: ");
                    int accountNumber = scnr.nextInt();
                    System.out.println("Enter the withdrawal amount: ");
                    double accountWithdrawl = scnr.nextDouble();

                    bank.withdrawAccount(accountNumber, accountWithdrawl);
                } 
                else if (choice == 5) {
                    System.out.println("Enter account number to close: ");
                    int accountNumber = scnr.nextInt();
                    bank.closeAccount(accountNumber);
                } 
                else if (choice == 6) {
                    System.exit(0);
                }
            }
        }
    }
}
