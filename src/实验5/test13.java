import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入五个点：");
        double[][] points = new double[5][2];
        Scanner input = new Scanner(System.in);
        for (int i = 0 ; i < 5 ; i++){
            for (int j = 0 ; j < 2 ; j++){
                points[i][j] = input.nextDouble();
            }
        }
        MyRectangle2D1 rectangle = get(points);
        System.out.println("The bounding rectangle's center (" + rectangle.getX() + ", " + rectangle.getY() + "), width " +rectangle.getWidth() + ", height " + rectangle.getHeight());

    }
    public static MyRectangle2D1 get(double[][]points){
            double xMax = points[0][0], yMax = points[0][1], xMin = points[0][0], yMin = points[0][1];
            for (int a = 0 ; a < points.length ; a++){
                if (points[a][0] > xMax)
                    xMax = points[a][0];
                if (points[a][0] < xMin)
                    xMin = points[a][0];
                if (points[a][1] > yMax)
                    yMax = points[a][1];
                if (points[a][1] < yMin)
                    yMin = points[a][1];
            }
            return new MyRectangle2D1((xMax + xMin) / 2, (yMax + yMin) / 2, xMax - xMin, yMax - yMin);
    }
}
class MyRectangle2D1{
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

    public MyRectangle2D1() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.height = 1;
    }

    public MyRectangle2D1(double x, double y, double width, double height) {
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


}
