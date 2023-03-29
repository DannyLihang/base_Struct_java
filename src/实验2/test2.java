import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an ASCII code:");
        int num = scanner.nextInt();
        System.out.printf("The character for ASCII code %d is %c",num,num);
    }
}
