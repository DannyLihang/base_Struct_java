import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a three-digit integer:");
        int num = scanner.nextInt();
        String str = Integer.toString(num);
        int l = 0;
        int r =str.length() - 1;
        int flag = 1;
        while (l<r)
        {
            if(str.charAt(l)!=str.charAt(r))
                flag = 0;break;
        }
        if(flag == 1) System.out.printf("%d is a palindrome",num);
        else System.out.printf("%d is not a palindrome",num);
    }
}
