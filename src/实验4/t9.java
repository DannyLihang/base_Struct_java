public class t9 {
    public static void main(String[] args) {
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("regularPolygon1: perimeter:"+regularPolygon1.getPerimeter()+" area:"+regularPolygon1.getArea());
        System.out.println("regularPolygon2: perimeter:"+regularPolygon2.getPerimeter()+" area:"+regularPolygon2.getArea());
        System.out.println("regularPolygon3: perimeter:"+regularPolygon3.getPerimeter()+" area:"+regularPolygon3.getArea());
    }
}
class RegularPolygon{
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;
    public RegularPolygon(){}

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
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

    public double getPerimeter(){
        return this.n*this.side;
    }

    public double getArea(){
        return this.n*this.side*this.side/4*Math.tan(Math.PI/n);
    }
}
