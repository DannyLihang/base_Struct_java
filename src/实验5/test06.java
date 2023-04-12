import java.util.Date;
import java.util.Scanner;

public class test06 {
    /*
    * 使用教材编程练习题 9.7（参见教材 P306）中创建的 Account 类来模
拟一台 ATM 机。创建一个有 10 个账户的数组，其 id 为 0,1,…，9, 并初始化收支为 100
美元。系统提示用户输人一个 id。如果输人的 id 不正确，就要求用户输人正确的 id。
    * */
    public static void main(String[] args) {
        Account []account = new Account[10];
        for (int i = 0; i < 10; i++) {
            account[i] = new Account();
            account[i].setId(i);
            account[i].setBalance(100);
        }
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("请输入ID：");
            int id = scanner.nextInt();
            if(id == account[0].getId()) break;
        }while (true);
        menu();
        int n = scanner.nextInt();
        switch (n){
            case 1:
                System.out.println(account[0].getBalance());break;
            case 2:
                System.out.println("Enter an amount to withdraw:");
                double amount = scanner.nextDouble();
                account[0].withDraw(amount);
                break;
            case 3:
                System.out.println("Enter an amount to deposit:");
                double amount1 = scanner.nextDouble();
                account[0].deposit(amount1);
                break;
            case 4:
                break;
        }
    }
    public static void menu(){
        System.out.println("Main menu");
        System.out.println("1.check balance");
        System.out.println("2.withdraw");
        System.out.println("3.deposit");
        System.out.println("4.exit");
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

