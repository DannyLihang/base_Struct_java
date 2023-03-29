import java.util.Scanner;

public class test19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int temp = scanner.nextInt();
        int max = temp;
        int count = 1;
        while (temp!=0)
        {
            temp = scanner.nextInt();
            if(temp > max)
            {
                max = temp;
                count = 1;
            }
            else if(temp == max) count++;
        }
        System.out.printf("The largest number is %d\n",max);
        System.out.printf("The occurrence count of the largest number is %d",count);
    }
}
