import java.util.Scanner;

public class test21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first 12 digits of an ISBN-13 as a string:");
        String str = scanner.next();
        if(str.length()!=12)
        {
            System.out.println(str+" is an invalid input");
            return;
        }
        else {
            int sum = 0;
            for(int i = 1 ; i <= 12 ; i++)
            {
                int flag = 1;
                if(i%2==0) flag*=3;
                sum += flag*Integer.parseInt(String.valueOf(str.charAt(i-1)));
            }
            int m = 10-sum%10;
            if(m == 10) m = 0;
            System.out.println("The ISBN-13 number is "+str+m);
        }
    }
}
