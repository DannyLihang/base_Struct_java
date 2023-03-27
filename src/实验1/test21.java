import java.util.Scanner;

public class test21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three points for p0,p1,and p2:");
        double x0,x1,x2,y0,y1,y2;
        x0 = scanner.nextDouble();
        y0 = scanner.nextDouble();
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        double t = (x1-x0)*(y2-y0)-(x2-x0)*(y1-y0);
        if(t>0) System.out.printf("(%.1f,%.1f)is on the left side of the line from (%.1f,%.1f)to(%.1f,%.1f)",x2,y2,x0,y0,x1,y1);
        else if(t== 0 )System.out.printf("(%.1f,%.1f)is on the line from (%.1f,%.1f)to(%.1f,%.1f)",x2,y2,x0,y0,x1,y1);
        else System.out.printf("(%.1f,%.1f)is on the right side of the line from (%.1f,%.1f)to(%.1f,%.1f)",x2,y2,x0,y0,x1,y1);
    }
}
