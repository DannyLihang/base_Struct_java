import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input two integer:");
        boolean flag = true;
        while (flag){
        try {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            System.out.println(n1+n2);
        } catch (Exception e) {
            System.out.println("InputMismatchException");
            scanner.nextLine();
        }
        }
    }
}
