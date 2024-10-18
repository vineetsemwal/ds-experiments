package solid.liskov;

public class WithDrawalSupportedAccount extends BankAccount implements IWithDrawalCapableAccount {

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            throw new IllegalArgumentException("Insufficient balance");
        }
       setBalance( getBalance() - amount);
    }

}
