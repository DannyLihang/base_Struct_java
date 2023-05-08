import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*10);
        }
        System.out.println("input integer");
        try {
            int n = scanner.nextInt();
            System.out.println(arr[n]);
        } catch (Exception e) {
            System.out.println("out of Bounds");
        }
    }
}
