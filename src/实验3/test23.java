import java.util.Scanner;

public class test23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the number of values:");
        int n = scanner.nextInt();
        int[] values = new int[n];
        System.out.printf("Enter the values:");
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }
        if(isConsecutiveFour(values)){
            System.out.println("The list has consecutive four");
        }
        else {
            System.out.println("The list has not consecutive four");
        }
    }
    public static boolean isConsecutiveFour(int[] values)
    {
        for (int i = 0; i < values.length - 3; i++) {
            if(values[i] == values[i+1]&&values[i+2]==values[i]&&values[i]==values[i+3]){
                return true;
            }
        }
        return false;
    }
}
