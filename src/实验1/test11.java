import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter balance and annual interest rate:");
        int s = scanner.nextInt();
        double m = scanner.nextDouble();
        double t = s*(m/1200);
        System.out.printf("The interest is %.2f",t);
    }
}
