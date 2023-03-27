import java.util.Scanner;

public class test20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the exchange rate from dollars to RMB:");
        double rate = scanner.nextDouble();
        System.out.println("Enter 0 to convert dollars to RMB and 1 vice verse:");
        int flag = scanner.nextInt();
        if(flag == 0)
        {
            System.out.println("Enter the dollar amount:");
            double amount = scanner.nextDouble();
            System.out.printf("$%.1f is %.1f Yuan",amount,amount*rate);
        }
        else if(flag == 1)
        {
            System.out.println("Enter the RMB amount:");
            double amount = scanner.nextDouble();
            System.out.printf("%.1f Yuan is $%.13f",amount,amount/rate);
        }
        else
        {
            System.out.println("Incorrect input");
        }
    }
}
