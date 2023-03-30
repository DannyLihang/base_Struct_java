import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password:");
        String password = input.next();
        if(isPassword(password))
            System.out.println("Valid Password");
        else System.out.println("Invalid Password");
    }
    public static boolean isPassword(String password)
    {
        if(password.length()>=8)
        {
            int i = 0;
            int flag = 0;
            int num =0;
            while (i<password.length())
            {
                if(password.charAt(i)>='1'&&password.charAt(i)<='9' || password.charAt(i)>='a'&&password.charAt(i)<='z' ||password.charAt(i)>='A'&&password.charAt(i)<='Z')
                    flag++;
                if(password.charAt(i)>='1'&&password.charAt(i)<='9')
                    num++;
                i++;
            }
            if(flag == password.length())
            {
                if(num>=2)return true;
                else return false;
            }
        }
        return false;
    }
}
