import java.util.Scanner;

public class test18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ten numbers:");
        int[] list = new int[10];
        for (int i = 0; i < 10; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.printf("The distinct numbers are :");
        int[]Help = eliminateDuplicates(list);
        for (int i = 0; i < Help.length; i++) {
            System.out.printf("%d ",Help[i]);
        }
    }
    public static int[] eliminateDuplicates(int[] list)
    {
        int count = 0;
        list[count] = list[0];
        for (int i = 1; i < list.length; i++) {
            if(list[count]!=list[i])
            {
                list[++count] = list[i];
            }
        }
        int[] help = new int[count+1];
        for (int i = 0; i <= count; i++) {
            help[i] = list[i];
        }
        return help;
    }
}
