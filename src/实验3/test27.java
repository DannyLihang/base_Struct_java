import java.util.Scanner;

public class test27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] a= new double[3][3];
        double[][] b= new double[3][3];
        double[][] c;
        System.out.printf("Enter matrix1:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = scanner.nextDouble();
            }
        }
        System.out.printf("Enter matrix2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("The matrices are added as follows");
        c = addMatrix(a,b);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%.1f ",c[i][j]);
            }
            System.out.println();
        }

    }
    public static double[][] addMatrix(double[][]a,double[][]b)
    {
        double[][] c= new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j]+b[i][j];
            }
        }
        return c;
    }
}
