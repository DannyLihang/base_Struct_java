import java.util.Scanner;

public class test22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter list1:");
        int n = scanner.nextInt();
        int[] list1 = new int[n];
        for (int i = 0; i < n; i++) {
            list1[i] = scanner.nextInt();
        }
        System.out.printf("Enter list2:");
        int m = scanner.nextInt();
        int[] list2 = new int[m];
        for (int i = 0; i < m; i++) {
            list2[i] = scanner.nextInt();
        }
        if(equals(list1,list2)) System.out.println("Two lists are strictly identical");
        else System.out.println("Two lists are not strictly identical");
    }
    public static boolean equals(int[] list1 , int[] list2)
    {
        if(list1.length == list2.length) {
            int count = 0;
            for (int i = 0; i <list1.length; i++) {
                if(list1[i]==list2[i]) count++;
            }
            if(count == list2.length) return true;
            else return false;
        }
        return false;
    }
}
