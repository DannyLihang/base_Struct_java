import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side:");
        int side = scanner.nextInt();
        double area = (3*Math.sqrt(3)/2*Math.pow(side,2));
        System.out.printf("The area of the hexagon is %.14f",area);
    }
}
