import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        System.out.println("Enter the amount of water in kilograms:");
        Scanner scanner = new Scanner(System.in);
        double water = scanner.nextDouble();
        System.out.println("Enter the initial temperature:");
        double t1 = scanner.nextDouble();
        System.out.println("Enter the final temperature:");
        double t2 = scanner.nextDouble();
        double Q = water*(t2-t1)*4184;
        System.out.printf("The energy needed is %.1f",Q);
    }
}
