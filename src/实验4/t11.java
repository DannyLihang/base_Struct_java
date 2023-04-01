import java.util.Scanner;

public class t11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input a,b,c,d,e,f:");
        LinearEquation linearEquation = new LinearEquation(scanner.nextDouble(),
                scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble(),
                scanner.nextDouble(),scanner.nextDouble());
        if(linearEquation.isSolvable()){
            System.out.println("X:"+linearEquation.getX()+" Y:"+linearEquation.getY());
        }
        else System.out.println("The equation has no solution");
    }
}
class LinearEquation{
    private double a,b,c,d,e,f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public  boolean isSolvable(){
        double temp = this.a *this.d - this.b*this.c;
        if(temp!=0) return true;
        else return false;
    }

    public double getX(){
        return (this.e*this.d - this.b*this.f)/(this.a*this.d - this.b*this.c);
    }

    public double getY(){
        return (this.a*this.f - this.e*this.c)/(this.a*this.d - this.b*this.c);
    }
}