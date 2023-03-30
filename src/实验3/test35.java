import java.util.Scanner;

public class test35 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix :");
        int n = scanner.nextInt();
        int [][] num = new int[n][n];
        System.out.println("Enter the matrix row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                num[i][j] = scanner.nextInt();
            }
        }
        find(num);
    }
    public static void find(int [][]num){
        for (int i = num.length; i > 0 ; i--) {
            for (int j = 0; j <= num.length - i; j++) {
                for (int k = 0; k <= num.length-i ; k++) {
                    int sum = 0;
                    for (int l = j; l - j< i ; l++) {
                        for (int m = k; m -k < i; m++) {
                            sum += num[l][m];
                        }
                    }
                    if( i * i == sum){
                        System.out.printf("The maximum square submatrix is at (%d,%d) with size %d\n",j,k,i);
                        return;
                    }
                }
            }
        }
    }
}
