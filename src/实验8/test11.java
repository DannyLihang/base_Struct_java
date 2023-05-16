public class test11 {
    /**
     * 编写一个名为 Octagon 的类，它继承自 GeometricObject 类并实现
     * Comparable 和 Cloneable 接口。假设八边形八条边的边长都相等，它的面积可以使用下
     * 面的公式计算：
     */
    public static void main(String[] args) {
        /**
         * 编写一个测试程序，创建一个边长值为 5 的 Octagon 对象，然后显示它的面积和周长。
         * 使用 clone 方法创建一个新对象，并使用 compareTo 方法比较这两个对象。
         */
        Octagon octagon = new Octagon(5);
        System.out.println("面积："+octagon.getArea());
        System.out.println("周长："+octagon.getPerimeter());
        Octagon Clone = (Octagon) octagon.clone();
        if(octagon.compareTo(Clone)==0)
            System.out.println("true");
    }
}
class Octagon extends GeometricObject implements Comparable,Cloneable{
    private double side;

    public double getSide() {
        return side;
    }
    @Override
    public int compareTo(Object o) {
        if(((Octagon)o).getSide() > this.getSide() )
            return 1;
        else if(((Octagon)o).getSide() < this.getSide())
            return -1;
        else return 0;
    }

    public Octagon(double side){
        this.side=side;
    }

    public double getArea(){
        return (2+4*Math.sqrt(2))*side*side;
    }

    public double getPerimeter(){
        return 8*side;
    }

   protected Object clone(){
        return new Octagon(side);
   }
}
