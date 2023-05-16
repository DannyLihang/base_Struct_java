public class test07 {
    /**
     * 设计一个名为 Colorable 的接口，其中有名为 howToColor（）
     * 的 void 方法。可着色对象的每个类必须实现 Colorable 接口。设计一个名为 Square 的类，
     * 继承自 GeometricObject 类并实现 Colorable 接口。实现 howToColor 方法，显示一个消
     * 息 Color all four sides（给所有的四条边着色）。编写一个测试程序，创建有五个
     * GeometricObject 对象的数组。对于数组中的每个对象而言，如果对象是可着色的，那就
     * 调用 howToColor 方法。
     */
    public static void main(String[] args) {
        GeometricObject[] square1s = new Square1[5];
        for (int i = 0; i < square1s.length; i++) {
            square1s[i] = new Square1();
        }
        for (int i = 0; i < square1s.length; i++) {
            square1s[i].toString();
        }
    }
}
interface Colorable{
     void howToColor();
}
class Square1  extends GeometricObject implements Colorable{
    public void howToColor(){
        System.out.println("Color all four sides");
    }

    public String toString() {
        if (super.isFill()) {
            howToColor();
        }
        return super.toString();
    }
}
