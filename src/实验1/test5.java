import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        int sum = 0;
        if(num>=1000)
            num%=1000;
        while (num!=0) {

            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
