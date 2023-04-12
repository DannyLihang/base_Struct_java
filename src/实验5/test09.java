public class test09 {
    /*
    实现这个类并编写测试程序，创建一个 Circle2D 对象 cl(new Circle2D(2,2,5.5)), 显示它
的面积和周长，还要显示cl.contains(3,3)、cl.contains(new Circle2D (4,5,10.5))和cl.overlaps(new
Circ1e2D(3,5,2.3))的结果
     */
    public static void main(String[] args) {
        Circle2D cl = new Circle2D(2, 2, 5.5);
        System.out.println("Area="+cl.getArea());
        System.out.println("Perimeter="+cl.getPerimeter());
        System.out.println(cl.contains(3,3));
        System.out.println(cl.contains(new Circle2D (4,5,10.5)));
        System.out.println(cl.overlaps(new Circle2D(3,5,2.3)));
    }

    /*
    定义 Circle2D 类，包括：
 两个带有 get 方法的名为 x 和 y 的 double 型数据域，表明圆的中心点。
 一个带 get 方法的数据域 radius。
 一个无参构造方法，该方法创建一个(x,y)值为(0,0)且 radius 为 1 的默认圆。
 一个构造方法，创建带指定的 x、y 和 radius 的圆。
 一个返回圆面积的方法 getArea()。
 一个返回圆周长的方法 getPerimeter()。
     */
}
class Circle2D{
    public double x;
    public double y;
    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle2D() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*Math.pow(this.radius,2);
    }

    public double getPerimeter(){
        return Math.PI*2*this.radius;
    }


    public boolean contains(double x , double y){
        if(x*x+y*y < this.radius*this.radius) return true;
        return false;
    }

    public boolean contains(Circle2D circle){
        if((this.x- circle.x)*(this.x- circle.x) + (this.y- circle.y)*(this.y- circle.y)<=Math.abs(this.radius-circle.radius)*Math.abs(this.radius-circle.radius)) return true;
        return false;
    }

    public boolean overlaps(Circle2D circle){
        if((this.x- circle.x)*(this.x- circle.x) + (this.y- circle.y)*(this.y- circle.y)<=Math.pow((this.radius+circle.radius),2)) return true;
        return false;
    }
}