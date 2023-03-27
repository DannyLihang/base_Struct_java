import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer:");
        String str = scanner.next();
        int sum = 0;
        for(int i = 1 ; i< str.length();i++)
        {
            sum+=i*Integer.parseInt(String.valueOf(str.charAt(i-1)));
        }
        sum%=11;
        if(sum == 10) System.out.println("The ISBN-10 number is "+str+"X");
        else System.out.println("The ISBN-10 number is "+str+sum);
    }
}
