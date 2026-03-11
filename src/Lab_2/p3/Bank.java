package Lab_2.p3;
import java.util.Vector;

public class Bank {

    public static Vector<Account> update(Vector<Account> accounts){

        for (Account account : accounts){

            if(account instanceof CheckingAccount){
                ((CheckingAccount) account).deductFee();
            }else if(account instanceof  SavingAccount){
                ((SavingAccount) account).addInterest();
            }

        }return accounts;

    }

    public static Vector<Account> openAccount(Vector<Account> accounts , Account account){

       accounts.add(account);
       return accounts;

    }

    public static Vector<Account> closeAccount(Vector<Account> accounts , Account accountToRemove){

        for(int i = 0;i < accounts.size();i++){
            if(accounts.get(i).getAccNumber() == accountToRemove.getAccNumber()){
                accounts.remove(i);
            }
        }return accounts;
    }

    public static void main(String[] args){

        Vector<Account> accounts = new Vector<>();
        Account Amigos = new Account(2007);
        openAccount(accounts , Amigos);
        SavingAccount Elza = new SavingAccount(2006);
        openAccount(accounts , Elza);
        CheckingAccount Johny = new CheckingAccount(2008);
        openAccount(accounts , Johny);

        for(Account account : accounts){

            account.print();

        }
        Amigos.deposit(60);
        Elza.deposit(40);
        Johny.deposit(1000);

        System.out.println();
        System.out.println("Before update");
        for(Account account : accounts){

            account.print();

        }
        update(accounts);
        Johny.withdraw(60);
        update(accounts);
        Johny.deposit(15);
        update(accounts);
        System.out.println();
        System.out.println("After update");
        for(Account account : accounts){

            account.print();

        }

    }
}
