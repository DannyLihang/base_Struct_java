public class test15 {
    public static void main(String[] args) {
        Rational2 r1 = new Rational2(2,1);
        Rational2 r2 = new Rational2(2,3);
        System.out.println(r1.toString()+"+"+r2.toString()+"="+(r1.add(r2)).toString());
        System.out.println(r1.toString()+"-"+r2.toString()+"="+(r1.subtract(r2)).toString());
        System.out.println(r1.toString()+"*"+r2.toString()+"="+(r1.multiply(r2)).toString());
        System.out.println(r1.toString()+"/"+r2.toString()+"="+(r1.divide(r2)).toString());
    }
}
class Rational2{
    private long numerator;
    private long denominator;
    public long getNumerator() {
        return numerator;
    }
    public void setNumerator(long numerator) {
        this.numerator = numerator;
    }
    public long getDenominator() {
        return denominator;
    }
    public void setDenominator(long denominator) {
        this.denominator = denominator;
    }
    public Rational2() {
        super();
        this.numerator = 0;
        this.denominator = 1;
    }
    public Rational2(long numerator, long denominator) {
        super();
        long gcd = gcd(numerator,denominator);
        this.numerator = numerator/gcd;
        this.denominator = denominator/gcd;
    }
    private long gcd(long n, long d) {
        long s1 = Math.abs(n);
        long s2 = Math.abs(d);
        long remander = s1%s2;
        while(remander!= 0) {
            s1 = s2;
            s2 = remander;
            remander = s1%s2;
        }
        return s2;
    }
    public Rational2 add(Rational2 secondRational) {
        long n = numerator*secondRational.getDenominator()+denominator*secondRational.getNumerator();
        long d = denominator*secondRational.getDenominator();
        System.out.println(n+" "+d);
        return new Rational2(n,d);
    }
    public Rational2 subtract(Rational2 secondRational) {
        long n = numerator*secondRational.getDenominator()-denominator*secondRational.getNumerator();
        long d = denominator*secondRational.getDenominator();
        return new Rational2(n,d);
    }
    public Rational2 multiply(Rational2 secondRational) {
        long n = numerator*secondRational.getNumerator();
        long d = denominator*secondRational.getDenominator();
        return new Rational2(n,d);
    }
    public Rational2 divide(Rational2 secondRational) {
        long n = numerator*secondRational.getDenominator();
        long d = denominator*secondRational.getNumerator();
        return new Rational2(n,d);
    }
    public String toString() {
        if(denominator == 1) {
            return numerator+"";
        }
        else {
            return numerator+"/"+denominator;
        }
    }
}

