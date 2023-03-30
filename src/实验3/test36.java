import java.util.Scanner;

public class test36 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter number n:");
        int n = scanner.nextInt();
        char [][] num = new char[n][n];
        System.out.printf("Enter %d rows of letters separated by space:\n",n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                num[i][j] = scanner.next().charAt(0);
            }
        }
        if(find(num)) System.out.println("The input array is a Latin square");
    }
    public static boolean find(char [][]arr){

        for (int i = 0; i < arr.length; i++) {
            if(!isRow(arr[i])) return false;
        }
        if(!isCol(arr)) return false;
        return true;
    }
    public static boolean isRow(char[] arr)
    {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] == arr[i]) return false;
        }
        return true;
    }
    public static boolean isCol(char[][] arr)
    {
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[i][j] == arr[i][j-1]) return false;
            }
        }
        return true;
    }
}
