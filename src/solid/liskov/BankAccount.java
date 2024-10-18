package solid.liskov;

public class BankAccount {

    private double balance;

    public void deposit(final double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
