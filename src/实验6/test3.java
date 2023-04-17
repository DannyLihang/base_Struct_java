import java.util.Date;

public class test3 {
    public static void main(String[] args) {
        Account account = new Account();
        checkingAccount checkingAccount = new checkingAccount();
        savingAccount savingAccount = new savingAccount();
        System.out.println(account);
        System.out.println(checkingAccount);
        System.out.println(savingAccount);
    }
}
class Account{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated ;
    public Account(){}
    public Account(int id , double balance){ //含参构造器
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate*balance/1200;
    }
    public void withDraw(double account){
        balance-=account;
    }
    public void deposit(double account){
        balance+=account;
    }
}
class checkingAccount extends Account{
    public String toString(){
        return "checkingAccount";
    }
}
class savingAccount extends Account{
    public String toString(){
        return "savingAccount";
    }
}