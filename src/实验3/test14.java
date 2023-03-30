import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];
        int count = 0;
        System.out.println("Enter ten numbers:");
        for (int i = 0; i < 10; i++) {
            int temp = scanner.nextInt();
            if(haveNumber(nums,temp)){
                nums[++count] = temp;
            }
        }
        System.out.println("The member of distinct number is "+count);
        System.out.printf("The distinct number are:");
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!= 0)
            System.out.printf("%d ",nums[i]);
        }
    }
    public static boolean haveNumber(int []nums,int n)
    {
        for (int i = 0; i < 10; i++) {
            if(nums[i] == n) return false;
        }
        return true;
    }
}
