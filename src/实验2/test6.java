import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a SSN:");
        
        if(isSsn(str))
         System.out.printf("%s is a valid social security number",str);
        else System.out.printfString str = scanner.next();("%s is a invalid social security number",str);
    }
    public static boolean isSsn(String str)
    {
        return str.matches("\\d{3}-\\d{2}-\\d{4}");
    }
}
