import java.util.ArrayList;
import java.util.Optional;

public class Bank {

    private ArrayList<AccountC> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(AccountC account) {
        accounts.add(account);
        System.out.println("Thank you, the account number is " + account.getAccountNumber());
    }

    public void listAccounts() {
        accounts.forEach(System.out::println);
    }

    public void depositAccount(int accountNumber, double accountDeposit) {
        Optional<AccountC> account = accounts.stream().filter(a -> a.getAccountNumber() == accountNumber).findFirst();
        if (account.isPresent()) {
            account.get().deposit(accountDeposit);

        } else {
            System.out.println("Account not found");
        }
    }

    public void withdrawAccount(int accountNumber, double accountWithdraw) {
        Optional<AccountC> account = accounts.stream().filter(a -> a.getAccountNumber() == accountNumber).findFirst();
        if (account.isPresent()) {
            account.get().withdraw(accountWithdraw);
        } else {
            System.out.println("Account not found");
        }
    }

    public void closeAccount(int accountNumber) {
        Optional<AccountC> account = accounts.stream().filter(a -> a.getAccountNumber() == accountNumber).findFirst();
        if (account.isPresent()) {
            account.get().setClosed(true);
            System.out.println("Account closed, current balance is " + account.get().getBalance()
                    + ", deposits are no longer possible");
        } else {
            System.out.println("Account not found");
        }
    }
}
