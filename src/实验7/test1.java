import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            System.out.printf("%d + %d = %d\n",n1,n2,n1+n2);
        } catch (Exception e) {
            throw new NumberFormatException("it is not standard format!");
        }
    }
}
