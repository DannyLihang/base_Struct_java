import java.util.Scanner;

public class test29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size for the matrix:");
        int n = scanner.nextInt();
        int [][]num = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                num[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        judge(num);
    }
    public static void judge(int[][]num)
    {
        for (int i = 0; i < num.length; i++) {
            int flagr = 1;
            for (int j = 1; j < num[0].length; j++) {
                if(num[i][0] != num[i][j])
                {
                    flagr = 0;break;
                }
            }
            if(flagr == 1 && num[i][0] == 1) System.out.printf("All 1s on row %d\n",i);
            else if(flagr == 1 && num[i][0] == 0) System.out.printf("All 0s on row %d\n",i);
        }
    }
}
