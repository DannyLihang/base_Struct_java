import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to be saved for each month:");
        int money = scanner.nextInt();
        double t = money;
        System.out.println("Enter the annual is interest rate:");
        int rate = scanner.nextInt();
        System.out.println("Enter the number of months:");
        int month = scanner.nextInt();
        double r = rate/100.0/12;
        for(int i = 0; i <month ; i++)
        {
            t *= 1.0+r;
            if(i>0)
            t+=money;
        }
        System.out.printf("After the %dth month,the account value is %.12f",month,t);
    }
}
