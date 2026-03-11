package Lab_2.p3;

public class Account {

    private double balance;
    private int accNumber;
    public Account(int a){
        balance = 0.0;
        accNumber = a;
    }

    public void deposit(double num){
        balance += num;
    }

    public void withdraw(double sum){
        balance -= sum;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void transfer(double amount , Account other){
        other.deposit(amount);
        withdraw(amount);
    }

    @Override
    public String toString(){
        return "Account number : " + getAccNumber() +
                "\nBalance : " + getBalance();
    }

    public final void print(){
        System.out.println(toString());
    }
}
