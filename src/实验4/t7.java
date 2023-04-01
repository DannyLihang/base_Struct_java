import java.util.Date;

public class t7 {
    public static void main(String[] args) {
        Account account = new Account(1122,2000);
        account.setAnnualInterestRate(0.045);
        account.withDraw(2500);
        account.deposit(3000);
        System.out.println("余额："+account.getBalance()+" 月利息："+account.getMonthlyInterestRate()
        +" 开户时期："+account.getDateCreated());
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
