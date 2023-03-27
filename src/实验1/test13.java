import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        int a =(int) (10*Math.random());
        int b =(int)(10*Math.random());
        int c =(int) (10*Math.random());
        System.out.printf("Enter the sum of three integer : %d %d %d",a,b,c);
        Scanner scanner = new Scanner(System.in);
        int sum1 = scanner.nextInt();
        int sum2 = a+b+c;
        if(sum1 == sum2) System.out.println("you are right");
        else System.out.println("you are false");
    }
}
