public class test03 {
    public static void main(String[] args) {
        /*
        (MyPoint 类）设计一个名为 MyPoint 的类，表示一个带 x 坐标和 y 坐标的点。该类包括：
 两个带 get 方法的数据域 x 和 y 分别表示它们的坐标。
 一个创建点(0,0)的无参构造方法。
 一个创建特定坐标点的构造方法。
 — 个名为 distance 的方法，返回从该点到 MyPoint 类型的指定点之间的距离。
 一个名为 distance 的方法，返回从该点到指定 x 和 y 坐标的指定点之间的距离。
实现这个类并编写一个测试程序，创建两个点（0,0)和（10,30.5)，并显示它们之间的距离
         */
        MyPoint myPoint1 = new MyPoint(0, 0);
        MyPoint myPoint2 = new MyPoint(10, 30.5);
        System.out.println("distance is "+myPoint1.distance(myPoint2));
    }
}
class MyPoint{

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint myPoint){
        return Math.sqrt((this.x- myPoint.x)*(this.x- myPoint.x) + (this.y- myPoint.y)*(this.y- myPoint.y));
    }

    public double distance(double x, double y){
        return Math.sqrt((this.x- x)*(this.x- x) + (this.y- y)*(this.y- y));
    }
}