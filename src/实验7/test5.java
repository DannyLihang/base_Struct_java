public class test5 {
    /*
        程练习题269定义了带三条边的Triangle类。在三角形中，任意两边之和总大于第三边，三角形类Triangle必须遵从这一规则。
        创建一个IllegalTriangleException类，
        然后修改Triangle类的构造方法，如果创建的三角形的边违反了这一规则，抛出一个IllegalTriangleException对象，
     */
    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(1, 1, 3);
        } catch (IllegalTriangleException e) {
            System.out.println("error!");
        }
    }
}
class Triangle {
    private double side1;
    private double side2;
    private double side3;

    //构造方法
    public Triangle() throws IllegalTriangleException {
        this(1.0, 1.0, 1.0);
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalTriangleException();
        }
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

    public double getArea() {
        double d = getPerimeter() / 2;
        double area = Math.sqrt(d * (d - side1) * (d - side2) * (d - side3));
        return area;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Triangle: side1: " + side1 + " side2: " + side2 + " side3: " + side3 + " perimeter:" + getPerimeter() + " area: " + getArea();
    }
}
class IllegalTriangleException extends Exception{

}