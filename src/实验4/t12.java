public class t12 {
    public static void intersectionPoint(segment segment1,segment segment2){
        double X = (segment2.getX1()*(segment2.getY2() - segment2.getY1())/(segment2.getX2()-segment2.getX1())-
                segment1.getX1()*(segment1.getY2() - segment1.getY1())/(segment1.getX2()-segment1.getX1()) +
                segment1.getY1()-segment2.getY2())/(((segment2.getY2()-segment2.getY1())/(segment2.getX2()-segment2.getX1()))-
                ((segment1.getY2()-segment1.getY1())/(segment1.getX2()-segment1.getX1())));
        System.out.println(X);
    }
}
class segment{
    private double x1,y1,x2,y2;

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public segment(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
}
