public class test09 {
    /**
     *（将 Circle 类改成可比较的）改写程序清单 13-2（参见教材 P426）中的 Circle 类，它继
     * 承自 GeometricObject 类并实现 Comparable 接口。覆盖 Object 类中的 equals 方法。当两
     * 个 Circle 对象半径相等时，则这两个 Circle 对象是相同的。
     */
}
class Circle extends GeometricObject implements Comparable{

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public boolean equals(Circle o){
        if(o.radius == this.radius){
            return true;
        }
        return false;
    }
}