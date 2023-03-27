import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");
        double weight = scanner.nextDouble();
        System.out.println("Enter height in inches:");
        int height = scanner.nextInt();
        double res = weight*0.45359237/(height*0.0254)/(height*0.0254);
        System.out.printf("BMI is %.15f",res);
    }
}
