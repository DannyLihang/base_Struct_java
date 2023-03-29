import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee's name:");
        String name = scanner.next();
        System.out.println("Enter number of hours worked in a week:");
        double hour = scanner.nextDouble();
        System.out.println("Enter hourly pay rate:");
        double rate1 = scanner.nextDouble();
        System.out.println("Enter federal tax withholding rate:");
        double rate2 = scanner.nextDouble();
        System.out.println("Enter state tax withholding rate:");
        double rate3 = scanner.nextDouble();
        System.out.printf("Hours worked: %.1f\n",hour);
        System.out.printf("Pay Rate: $%.2f\n",rate1);
        System.out.printf("Gross Pay: $%.1f\n",hour*rate1);
        System.out.println("Deductions:");
        System.out.printf("Federal withholding (%.1f%%): $%.1f\n",100*rate2,hour*rate1*rate2);
        System.out.printf("State withholding (%.1f%%): $%.2f\n",100*rate3,hour*rate1*rate3);
        System.out.printf("Total Deduction: $%.2f\n",hour*rate1*rate2+hour*rate1*rate3);
        System.out.printf("Net Pay: $%.2f\n",hour*rate1-(hour*rate1*rate2+hour*rate1*rate3));
    }
}
