import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String str = "";
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        int i =2;
        while (num!=1)
        {
            if(num%i == 0)
            {
                num/=i;
                str += i+", ";
            }
            else i++;
        }
        str = str.substring(0,str.length()-2);
        System.out.println(str+"。");
    }
}
