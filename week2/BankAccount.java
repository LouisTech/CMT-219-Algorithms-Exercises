public class BankAccount {
    private double balance;
    private String holderName;
    private String number;

    public BankAccount(String holderName, String number, double balance){
        this.holderName = holderName;
        this.number = number;
        this.balance = balance;
    }
    public BankAccount(String holderName, String number){
        this.holderName = holderName;
        this.number = number;
        this.balance = 0;
    }

    public String getName(){
        return this.holderName;
    }
    public void setName(String newName){
        this.holderName = newName;
    }
    public double getBalance(){
        return this.balance;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount){
        this.balance -= amount;
    }
    public String toString(){
        String s = number + "\t" + holderName + "\t" + balance;
        return s;
    }
}