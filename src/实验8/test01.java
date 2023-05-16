import java.util.Scanner;

public class test01 {
/**
 * 设计一个扩展自抽象类 GeometricObject 的新的 Triangle 类。实现 Triangle
 * 类，并编写一个测试程序，提示用户输入三角形的三条边、一种颜色以及一个表明该三
 * 角形是否填充的布尔值。程序应该根据用户的输入，使用这些边以及顔色和是否填充的
 * 信息，创建一个 Triangle 对象。
 */
public static void main(String[] args) {
    Triangle triangle = new Triangle();
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter three sides:");
    triangle.setSide1(scanner.nextDouble());
    triangle.setSide2(scanner.nextDouble());
    triangle.setSide3(scanner.nextDouble());
    System.out.println("enter the color");
    triangle.setColor(scanner.next());
    System.out.println("enter is fill");
    triangle.setFill(scanner.nextBoolean());
}
}
abstract class  GeometricObject{
    private String color;
    private boolean fill;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }
}
class Triangle extends GeometricObject{
    private double side1 ;
    private double side2 ;
    private double side3 ;

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
}