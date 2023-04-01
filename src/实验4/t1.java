public class t1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,40);
        Rectangle r2 = new Rectangle(3.5,35.9);
        System.out.println("r1: width "+r1.getWidth()+" height "+r1.getHeight()+
                " Area "+r1.getArea(4,40)+" Perimeter "+r1.getPerimeter(4,40));
        System.out.println("r2: width "+r2.getWidth()+" height "+r2.getHeight()+
                " Area "+r2.getArea(3.5,35.9)+" Perimeter "+r2.getPerimeter(3.5,35.9));
    }
}
class Rectangle {
    public double width = 1;
    public double height = 1;

    public Rectangle() {
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea(double width, double height) {
        return width * height;
    }

    public double getPerimeter(double width, double height) {
        return 2 * (width + height);
    }
}

