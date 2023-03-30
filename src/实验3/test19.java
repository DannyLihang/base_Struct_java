import java.util.Scanner;

public class test19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter list:");
        int n = scanner.nextInt();
        int []list = new int[n];
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        if(isSorted(list)) System.out.println("The list is already sorted");
        else System.out.println("The list is not sorted");
    }
    public static boolean isSorted(int[] list)
    {
        for (int i = 1; i < list.length; i++) {
            if(list[i-1]>list[i]) return false;
        }
        return true;
    }
}
