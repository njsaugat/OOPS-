package week3;



public class AccountTest{
    public static void main(String[] args){
        Account f1=new Account();
        f1.setBalance(40000);
        f1.debit(30000);
        System.out.println(f1.getBalance());
        f1.debit(20000);
        System.out.println(f1.getBalance());
    }
} 

class Account {
    private double accountBalance;
    public void setBalance(double balance){
        this.accountBalance=balance;
    }
    public double getBalance(){
        return this.accountBalance;
    }
    public void debit(double debitAmount){
        if(debitAmount>accountBalance){
            System.out.println("Debit amount exceeded account balance.");
            return ;
        }

        this.accountBalance=this.accountBalance-debitAmount;
    }

}