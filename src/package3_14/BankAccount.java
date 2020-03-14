package package3_14;

public class BankAccount {
    String accountName;
    double balance;
    int accountNumber;

    public BankAccount(String accountName, double balance, int accountNumber){
        this.accountName = accountName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void checkBalance(){
        System.out.println(this.balance);
    }

    public void addMoney(){
        this.balance += 10;
    }

    public void addMoney(double amount){
        this.balance += amount;
    }

    public void drawMoney(){
        this.balance -= 10;
    }

    public void drawMoney(double amount){
        this.balance -= amount;
    }
}
