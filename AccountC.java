public class AccountC {

    private String accountName;

    private double balance;

    private boolean isClosed;

    private static int counter = 1000;
    private int accountNumber;

    private Customer customer;

    private AccountC account;

    public AccountC() {
        isClosed = false;
        balance = 0;
        accountNumber = (counter++);
    }

    public void deposit(double da) {
        if (da > 0 && !isClosed) {
            balance += da;
            System.out.println("Deposit successful, the new balance is: " + balance);
        } else {
            System.out.println("Deposit failed, the balance is: " + balance);
        }
    }

    public void withdraw(double wa) {
        if (balance - wa >= 0 && wa >= 0 && !isClosed) {
            balance -= wa;
            System.out.println("Withdraw successful, the new balance is: " + balance);
        } 
        else {
            System.out.println("Withdrawal failed, the balance is: " + balance);
        }
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        AccountC.counter = counter;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountnumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }

    public AccountC getAccount() {
        return account;
    }

    public void setAccount(AccountC account) {
        this.account = account;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    


    public String toString() {
        return String.format("%d(%s) : %s : %s : %s : %.2f : %s", accountNumber, accountName, customer.getFirstName(),
                customer.getLastName(), customer.getSocialSecurityNumber(), balance,
                (isClosed == false ? "Account Open" : "Account Closed"));

    }
}