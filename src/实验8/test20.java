import java.util.Scanner;

public class test20 {
    /**
     * 抛物线方程可以表达为标准形式（ax2+bx+c）或者顶点式（a(xh)2+k）。
     * 编写一个程序，提示用户输入标准形式下的整数 a、b 和 c 值，显示顶点式下面
     * 的 h 和 k 值
     * h=-b/2a， k=(4ac-b²)/4a。
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a,b,c");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double h = -b/(2*a);
        double k = (4*a*c-b*b)/(4*a);
        System.out.println("h="+h+",k="+k);
    }
}
