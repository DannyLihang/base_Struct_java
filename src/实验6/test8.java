import java.util.Date;
import java.util.ArrayList;
public class test8 {
    public static void main(String[] args) {
        Account1 george = new Account1("George", 1122, 1000);
        george.deposit(30);
        george.deposit(40);
        george.deposit(50);
        george.withDraw(5);
        george.withDraw(4);
        george.withDraw(2);
        System.out.println("客户名"+ george.getName()+" 利率"+george.getAnnualInterestRate()+" 收支额 "+george.getBalance());
        System.out.println("交易记录");
        System.out.println(george.list.toString());

    }
}
class Account1{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated ;
    private String name;//用于储存客户名字
    public ArrayList<Transactions> list;
    public Account1(String name ,int id , double balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public Account1(){}
    public Account1(int id , double balance){ //含参构造器
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
        list.add(new Transactions('W',account,balance,"交易完成"));
    }
    public void deposit(double account){
        balance+=account;
        list.add(new Transactions('D',account,balance,"交易完成"));
    }
}
class Transactions{
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;//交易描述

    public Transactions( char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "date=" + date +
                ", type=" + type +
                ", amount=" + amount +
                ", balance=" + balance +
                ", description='" + description + '\'' +
                '}';
    }
}