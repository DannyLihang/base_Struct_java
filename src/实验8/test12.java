public class test12 {
    /**
     * 编写一个方法，求数组中所有几何对象的面积之和。方法签
     * 名如下：
     * public static double sumArea（GeometricObject[] a）
     * 编写测试程序，创建四个对象（两个圆和两个矩形）的数组，然后使用 sumArea 方法求
     * 它们的总面积。
     */
    public static void main(String[] args) {
        GeometricObject[] a = new GeometricObject[4];
        a[0] = new Circle(4);
        a[1] = new Circle(3);
        a[2] = new Square1(3);
        a[3] = new Square1(4);
        double sum = sumArea(a);
        System.out.println("总面积为：" + sum);
    }
    public static double sumArea(GeometricObject[] a){
        double sumArea = 0;
        for (int i = 0; i < a.length; i++) {
            sumArea += a[i].getArea();
        }
        return sumArea;
    }
}
