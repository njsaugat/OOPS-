package week7;

public class Bank {
    

    class Account{
        private double balance;
        
        Account(double balance){
            this.balance=balance;
        }
        public void deposit(double amount){
            this.balance+=amount;
        }
        public double getBalance(){
            return this.balance;
        }
    }

    public static void main(String[] args){
        Bank nabil =new Bank();
        Bank.Account savingsAccount=nabil.new Account(1000);
        savingsAccount.deposit(500);
        System.out.println("The account balance is "+ savingsAccount.getBalance());
    }
}
