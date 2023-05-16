public class test06 {
    /**
     * （ComparableCircle 类）创建名为 ComparableCircle 的类，它继承自 Circle 类，并实现
     * Comparable 接口。实现 compareTo 方法，使其根据面积比较两个圆。编写一个测试程序
     * 求出 ComparableCircle 对象的两个实例中的较大者。
     */
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(2);
        ComparableCircle circle2 = new ComparableCircle(6);
        if (circle1.compareTo(circle2) == 1)
            System.out.println("circle1 is bigger");
        else if (circle1.compareTo(circle2) == -1)
            System.out.println("circle2 is bigger");
        else if (circle1.compareTo(circle2) == 0)
            System.out.println("circle1 is the same as circle2");
    }
}
class ComparableCircle extends Circle implements Comparable{

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public Object max(ComparableCircle o1, ComparableCircle o2) {
        if (o1.compareTo(o2) > 0)
            return o1;
        else
            return o2;
    }

    public int compareTo(ComparableCircle o) {
        if (super.getArea() > o.getArea())
            return 1;
        else if (super.getArea() < o.getArea())
            return -1;
        else
            return 0;
    }
}