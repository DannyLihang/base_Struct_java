public class test10 {
    /**
     * （将 Rectangle 类变成可比较的）改写程序淸单 13-3（参见教材 P426）的 Rectangle 类，
     * 它继承自 GeometricObject 类并实现 Comparable 接口。覆盖 Object 类中的 equals 方法。
     * 当两个 Rectangle 对象面积相同时，则这两个对象是相同的
     */
}
class Rectangle extends GeometricObject implements Comparable{

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public boolean equals(Rectangle o){
        if(o.getArea() == this.getArea()){
            return true;
        }
        return false;
    }
}