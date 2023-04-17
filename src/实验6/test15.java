import java.util.ArrayList;
import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the points:");
        int n = scanner.nextInt();
        ArrayList arrayList = new ArrayList();
        System.out.println("Enter the coordinates of the points:");
        for (int i = 0; i < n; i++) {
            point point = new point(scanner.nextDouble(), scanner.nextDouble());
            arrayList.add(point);
        }
        double area = 0.0;
        for (int i = 2; i < arrayList.size(); i++) {
            triangle triangle = new triangle((point) arrayList.get(0),(point) arrayList.get(i - 1), (point) arrayList.get(i));
            area += triangle.getArea();
        }
        System.out.println("The total area is "+area);
    }
}
class point{
    private double x;
    private double y;

    public point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(point myPoint){
        return Math.sqrt((this.x- myPoint.x)*(this.x- myPoint.x) + (this.y- myPoint.y)*(this.y- myPoint.y));
    }
}
class triangle{
    private point point1 ;
    private point point2;

    public triangle(point point1, point point2, point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    private point point3;

    public double getArea(){
        double side1 = point1.distance(point2);
        double side2 = point1.distance(point3);
        double side3 = point3.distance(point2);
        double perimeter = side1+side2+side3;
        double temp = perimeter/2;
        return Math.sqrt(temp*(temp-side1)*(temp-side2)*(temp-side3));
    }

}