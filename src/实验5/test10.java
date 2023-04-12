public class test10 {
}
/*
定义 Triang1e2D 类，包含：
 三个名为 pl、p2 和 p3 的 MyPoint 类型数据域，这三个数据域都带有 get 和 set 方法。
MyPoint 在教材编程练习题 10.4 （参见教材 P340）中定义。
 一个无参构造方法，该方法创建三个坐标为（0,0）、（1,1）和（2,5）的点组成的默认三
角形。
 一个创建带指定点的三角形的构造方法。
 一个返回三角形面积的方法 getArea()。
 一个返回三角形周长的方法 getPerimeter()。
 */
class Triangle2D{
    private MyPoint1 p1;
    private MyPoint1 p2;
    private MyPoint1 p3;

    public MyPoint1 getP1() {
        return p1;
    }

    public void setP1(MyPoint1 p1) {
        this.p1 = p1;
    }

    public MyPoint1 getP2() {
        return p2;
    }

    public void setP2(MyPoint1 p2) {
        this.p2 = p2;
    }

    public MyPoint1 getP3() {
        return p3;
    }

    public void setP3(MyPoint1 p3) {
        this.p3 = p3;
    }

    public Triangle2D(){
        this.p1=new MyPoint1(0,0);
        this.p2=new MyPoint1(1,1);
        this.p3=new MyPoint1(2,5);
    }

    public Triangle2D(MyPoint1 p1, MyPoint1 p2, MyPoint1 p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getArea(){
        double temp = (this.getPerimeter()/2);
        return Math.sqrt(temp*(temp-p1.distance(p2))*(temp-p1.distance(p3))*(temp-p2.distance(p3)));
    }

    public double getPerimeter(){
        return p1.distance(p2)+p1.distance(p3)+ p2.distance(p3);
    }

    /*
    如果给定的点 p 在这个三角形内，那么方法 contains(MyPoint p)返回 true, 如下图 a 所
示。
 如果给定的三角形在这个三角形内，那么方法 contains(Triangle2D t)返回 true, 如下图 b
所示。
 如果给定的三角形和这个三角形重叠，那么方法 overlaps(Triangle2D t)返回 true, 如下图
c 所示。
     */
    /*public boolean contains(Triangle2D t){

    }*/

}
class MyPoint1{

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public MyPoint1(){
        this.x = 0;
        this.y = 0;
    }
    public MyPoint1(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint1 myPoint){
        return Math.sqrt((this.x- myPoint.x)*(this.x- myPoint.x) + (this.y- myPoint.y)*(this.y- myPoint.y));
    }

    public double distance(double x, double y){
        return Math.sqrt((this.x- x)*(this.x- x) + (this.y- y)*(this.y- y));
    }
}