import java.util.Scanner;

public class test32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row:");
        double m[][] = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = scanner.nextDouble();
            }
        }
        if(isMarkovMatrix(m)) System.out.println("It is a Markov matrix");
        else System.out.println("It is not a Markov matrix");
    }
    public static boolean isMarkovMatrix(double[][]m)
    {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if(m[i][j] < 0 ) return false;
            }
        }
        for (int i = 0; i < m.length; i++) {
            double sum = 0;
            for (int j = 0; j < m[0].length; j++) {
                sum+=m[j][i];
            }
            if(sum != 1) return false;
        }
        return true;
    }
}
