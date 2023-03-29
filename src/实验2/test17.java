import java.util.Scanner;

public class test17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入十进制数：");
        int num = scanner.nextInt();
        int []arr = new int[20];
        int i = 0;
        while (true)
        {
            if(num < 8)
            {
                arr[i] = num;break;
            }
            else {
                arr[i] = num/8;
            }i++;
            num%=8;
        }
        for(int j = 0 ; j <=i;j++)
        {
            System.out.printf("%d",arr[j]);
        }
    }
}
