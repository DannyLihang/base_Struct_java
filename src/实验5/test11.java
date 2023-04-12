public class test11 {
    public static void main(String[] args) {
        /*
        编写测试程序，创建一个 MyRectangle2D 对象 rl(new MyRectangle2D（2,
2,5.5,4.9)), 显示它的面积和周长，然后显示 rl.contains(3,3)、rl.contalns(new MyRectangle2D
(4 ,5 ,10.5 ,3.2)) 和 rl.overlaps (new MyRectangle2D(3,5, 2.3,5.4))的结果。
         */
        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
        System.out.println("面积为："+r1.getArea());
        System.out.println("周长为："+r1.getPerimeter());
        System.out.println(r1.contains(3,3));
        System.out.println(r1.contains(new MyRectangle2D(4,5,10.5,3.2)));


    }
}

class MyRectangle2D{
    private double x;
    private double y;
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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

    public MyRectangle2D() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.height = 1;
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.height*this.width;
    }

    public double getPerimeter(){
        return 2*(this.height+this.width);
    }

    /*

 如果给定的矩形在这个矩形内，那么方法 contains(MyRectangle2D r)返回 true, 如下图 b
所示。
 如果给定的矩形和这个矩形重叠，那么方法 overlaps(MyRectangle2D r)返回 true,
     */
    public boolean contains(double x, double y){
        if(x>(this.x-(this.width/2))&&(x<this.x+(this.width/2))&&(x>(this.y-(this.height/2)))&&(y<this.y+(this.height/2))){
            return true;
        }
        return false;
    }

    public boolean contains(MyRectangle2D r){
        if(r.height<this.height&&r.width<this.width&&this.contains(r.getX(),r.getY()))
        {
            return true;
        }return false;
    }
}
