import java.util.Scanner;

public class test30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("n:银行个数\tlimit:银行安全的最小总资产");
        int n = scanner.nextInt();
        double limit = scanner.nextDouble();
        double [][] amount = new double[n][n];
        double []sum = new double[n];
        int []num = new int[n];
        double []money = new double[n];
        for (int i = 0; i < n; i++) {
            money[i] = scanner.nextDouble();
            num[i] = scanner.nextInt();
            for (int j = 0; j < num[i]; j++) {
                int k = scanner.nextInt();
                amount[i][k] = scanner.nextDouble();
            }
        }
        String str = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum[j] = money[j];
                for (int k = 0; k < n; k++) {
                    sum[j] += amount[j][k];
                }
            }
            for (int j = 0; j < n; j++) {
                if(sum[j]<limit && money[j] != 0)
                {
                    count++;str+=i+" ";
                    for (int k = 0; k < n; k++) {
                        amount[k][j] = 0;
                        money[j] = 0;
                    }
                }
            }
        }
        if(1 == count) System.out.println(str);
        else System.out.println(str +" ");

    }
}
