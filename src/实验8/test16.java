public class test16 {
    /**
     * 设计一个名为 Complex 的复数来表示复数以及完成复数运算的 add、substract、multiply、
     * divide 和 abs 方法，并且覆盖 toStrlng 方法以返回一个表示复数的字符串。方法 toString
     * 返回字符串 a+bi。如果 b 是 0，那么它只返回 a。Complex 类应该也实现 Cloneable 接口。
     * 提供三个构造方法 Complex（a，b）、Complex（a）和 Complex（）。Comp1ex（）创建
     * 数字 0 的 Complex 对象，而 Complex（a）创建一个 b 为 0 的 Complex 对象。还提供
     * getRealPart（）和 getImaginaryPart（）方法以分别返回复数的实部和虚部。编写一个测
     * 试程序，提示用户输入两个复数，然后显示它们做加、减、乘、除之后的结果。
     */
}
class  Complex implements Cloneable{
    private int a;
    private int b;

    public Complex(int a) {
        this.a = a;
        this.b = 0;
    }

    public Complex(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Complex() {
        this.a = 0;
        this.b = 0;
    }

    public int getRealPart(){
        return a;
    }

    public int getImaginaryPart(){
        return b;
    }

    public String toString(){
        return a+"+"+b+"i";
    }

    public Complex add(Complex a){
        return new Complex(a.getRealPart()+this.a ,a.getImaginaryPart()+this.b);
    }

    public Complex subtract(Complex a){
        return new Complex(a.getRealPart()-this.a ,a.getImaginaryPart()-this.b);
    }

    public Complex multiply(Complex a){
        return new Complex(a.getRealPart()*this.a ,a.getImaginaryPart()*this.b);
    }

    public Complex divide(Complex a){
        return new Complex(a.getRealPart()/this.a ,a.getImaginaryPart()/this.b);
    }

    public double abs(){
        return Math.sqrt(this.a*this.a + this.b*this.b);
    }
}
