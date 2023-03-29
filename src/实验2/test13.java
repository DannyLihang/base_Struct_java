import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter loan amount, for example 120000.95:");
        double amount = scanner.nextDouble();
        System.out.println("Enter number of years as an integer, for example 5:");
        int year = scanner.nextInt();
        System.out.println("Enter yearly interest rate, for example 8.25:");
        double rate = scanner.nextDouble();
        double mrate= rate/1200.0;
        double inst, inst1,principal,balance = amount,tPayment=0;
        System.out.println("payment#"+"\t"+"Interest"+"\t"+"Principal"+"\t"+"Balance");
        double p = (amount*mrate*Math.pow(1+mrate,year*12)/(Math.pow(1+mrate,year*12)-1));
        System.out.printf("Monthly Payment :%.2f\n",p);
        for (int i = 1;i<=(year*12);i++)
        {
            inst1 = mrate*balance;
            tPayment+=inst1;
        }
        System.out.printf("Total Payment: %.2f\n",tPayment+amount);
        System.out.println("payment#"+"\t\t"+"Interest"+"\t\t"+"Principal"+"\t\t"+"Balance");
        for (int i = 1 ; i <= (year*12) ; i++)
        {
            inst = mrate*balance;
            principal = p - inst;
            balance = balance -principal;
            System.out.printf("%d\t\t\t%.2f\t\t\t%.2f\t\t\t%.2f\n",i,inst,principal,balance);
        }
    }
}
