import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three sides:");
        Triangle triangle = new Triangle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        System.out.println(triangle);
        System.out.println("The area is "+triangle.getArea());
        System.out.println("The perimeter is "+triangle.getPerimeter());
    }
}
class Triangle{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    public Triangle(){

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea(){
        double temp = getPerimeter()/2;
        return Math.sqrt(temp*(temp-this.side1)*(temp-this.side2)*(temp-this.side3));
    }

    public double getPerimeter(){
        return this.side1+this.side2+this.side3;
    }
    @Override
    public String toString(){
        return "Triangle: side1 = " +side1+" side2 = "+side2+" side3 = "+side3;
    }
}