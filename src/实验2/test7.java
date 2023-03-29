import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string s1:");
        String s1 = scanner.next();
        System.out.println("Enter string s2:");
        String s2 = scanner.next();
        if(s1.contains(s2)) System.out.println(s2+" is a substring of "+s1);
        else System.out.println(s2 + " is not a substring of "+s1);
    }
}
