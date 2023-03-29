import java.util.Scanner;

public class test20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        double sum2 = 0.0;
        System.out.println("Enter ten numbers:");
        for(int i = 0 ; i < 10 ; i++)
        {
            double num = scanner.nextDouble();
            sum+=num;
            sum2 += num*num;
        }
        System.out.printf("The mean is %.2f\n",sum/10);
        System.out.printf("The standard deviation is %.5f",Math.sqrt((sum2-sum*sum/10)/9));
    }
}
