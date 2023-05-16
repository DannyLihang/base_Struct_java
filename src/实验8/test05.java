public class test05 {
    /**
     * 修改 GeometricObject 类以实现 Comparable 接
     * 口，并且在 GeometricObject 类中定义一个静态的求两个 GeometricObject 对象中较大者
     * 的 max 方法。实现这个新的 GeometricObject 类，并编写一个测试程序，使用 max 方法
     * 求两个圆中的较大者和两个矩形中的较大者。
     */
}
abstract class GeometricObject1 implements Comparable<GeometricObject>{

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
    public int compareTo(GeometricObject1 geometricObject) {
        if(this.getArea()>geometricObject.getArea()) return 1;
        else if(this.getArea() < geometricObject.getArea()) return -1;
        else return 0;
    }

    public static GeometricObject1 max(GeometricObject1 o1, GeometricObject1 o2){
        return o1.compareTo(o2)>0?o1:o2;
    }
    public abstract double getArea();

}