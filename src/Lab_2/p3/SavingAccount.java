package Lab_2.p3;

public class SavingAccount extends Account{

    private final double interest = 0.1;
    public SavingAccount(int a){
        super(a);
    }

    public void addInterest(){
        super.deposit(getBalance() * interest);
    }

}
