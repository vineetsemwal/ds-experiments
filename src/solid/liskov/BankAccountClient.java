package solid.liskov;

public class BankAccountClient {
    public static void main(String[] args) {
        WithDrawalSupportedAccount account = new WithDrawalSupportedAccount();
        account.deposit(100);
        account.withdraw(50);
        System.out.println(account.getBalance());
    }
}
