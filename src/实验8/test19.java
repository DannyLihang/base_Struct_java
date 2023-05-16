import java.util.Scanner;
public class test19 {
    /**
     * （数学：求解二元方程）重写编程练习题 35，如果行列式小于 0，则使用编程练习题 340
     * 中的 Complex 类来得到虚根
     */
    public static void main(String[] args) {
        System.out.println("enter a decimal number:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("\ta=");
        float a0 = scanner.nextFloat();
        System.out.print("\tc=");
        float c0 = scanner.nextFloat();
        System.out.print("\tb=");
        float b0 = scanner.nextFloat();
        System.out.print("\td=");
        float d0 = scanner.nextFloat();
        float x0, y0;
        if (a0 == 0 && b0 != 0) {
            y0 = c0;
            x0 = (c0 - d0) / b0;
            System.out.println("求解得：\n\ty=" + y0 + "\n\tx=" + x0);
        } else if (a0 != 0 && b0 == 0) {
            y0 = d0;
            x0 = (d0 - c0) / a0;
            System.out.println("求解得：\n\ty=" + y0 + "\n\tx=" + x0);
        } else if (c0 == 0 && d0 == 0 || a0 == 0 && b0 == 0 || a0 == b0 && c0 == d0 || a0 == b0) {
            System.exit(0);
        } else {
            y0 = (c0 * b0 - d0 * a0) / (b0 - a0);
            x0 = -(c0 - d0) / (a0 - b0);
            System.out.println("求解得：\n\ty=" + y0 + "\n\tx=" + x0);
        }
    }

}
