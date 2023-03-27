import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter speed v:");
        int v = scanner.nextInt();
        System.out.println("Enter acceleration:");
        double a = scanner.nextDouble();
        double length = v*v/(2*a);
        System.out.printf("The minimum runway length for this airplane is %.13f meters",length);
    }
}
