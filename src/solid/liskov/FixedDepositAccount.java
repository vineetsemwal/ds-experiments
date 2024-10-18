package solid.liskov;

public class FixedDepositAccount extends BankAccount {


    public void addInterest() {
        System.out.println("adding interest to fixed deposit account");
        double interest=(10.0*getBalance())/100;
        setBalance(getBalance()+interest);
    }


}
