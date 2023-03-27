import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a,b,c:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = Math.pow(b*b-4*a*c,0.5);
        if(d>0)
        {
            double t1 = (d-b)/2/a;
            double t2 = (-d-b)/2/a;
            System.out.printf("The question has two roots %f and %f",t1,t2);
        }
        else if(d == 0 )
        {
            double t = -b/2/a;
            System.out.printf("The question has one root %f",t);
        }
        else
            System.out.println("The question has one roots");
    }
}
