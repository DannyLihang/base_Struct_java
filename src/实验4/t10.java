import java.util.Scanner;

public class t10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("请输入a,b,c:");
        QuadraticEquation quadraticEquation = new QuadraticEquation(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        System.out.println("discrimination:"+quadraticEquation.getDiscrimination());
        if(quadraticEquation.getDiscrimination()>0) System.out.printf("%f %f", quadraticEquation.getRoot1(),quadraticEquation.getRoot2());
        else if(quadraticEquation.getDiscrimination() == 0) System.out.printf("%f",quadraticEquation.getRoot2());
        else System.out.println("The equation has no roots");
    }
}
class QuadraticEquation{
    private double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscrimination(){
        return this.b*this.b - 4*this.a*this.c;
    }

    public double getRoot1(){
        if(getDiscrimination()<0) return 0;
        return (-this.b+Math.sqrt(getDiscrimination()))/2*b;
    }

    public double getRoot2(){
        if(getDiscrimination()<0) return 0;
        return (-this.b-Math.sqrt(getDiscrimination()))/2*b;
    }
}
