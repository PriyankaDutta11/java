public class Account {

    double accountNumber;
    double balance;

    Account(double accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public static void main(String[] args){
        Account account1 = new Account(12345665,100);
        System.out.println("Account 1 number: " + account1.accountNumber);
        System.out.println("Account 1 number: " + account1.balance);

    }

}
