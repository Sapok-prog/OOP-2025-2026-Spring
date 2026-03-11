package Lab_2.p3;

public class CheckingAccount extends Account{

    private int TRANSACTIONS = 0;
    private int FREE_TRANSACTIONS = 1;

    public CheckingAccount(int a){
        super(a);
    }

    public int getTRANSACTIONS() {
        return TRANSACTIONS;
    }

    public void deductFee(){
        TRANSACTIONS++;
        if(FREE_TRANSACTIONS > 0){
            FREE_TRANSACTIONS--;
            return;
        }withdraw(0.02);
    }

}
