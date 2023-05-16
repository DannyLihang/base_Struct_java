public class test17 {
    public static void main(String[] args) {

        Rational1[] rational11 = new Rational1[99];
        for (int i = 1; i < 100; i++) {
           rational11[i] = new Rational1(i, i + 1);
        }
        Rational1 sum= new Rational1();
        for (int i = 1; i < 100; i++) {
            Rational1 term = new Rational1();
            term = rational11[i].add(rational11[i+1]);
            sum.add(term);
        }
        System.out.println(sum);
    }
}
class Rational1{
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
    public Rational1() {
        super();
        this.numerator = 0;
        this.denominator = 1;
    }
    public Rational1(long numerator, long denominator) {
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
    public Rational1 add(Rational1 secondRational) {
        long n = numerator*secondRational.getDenominator()+denominator*secondRational.getNumerator();
        long d = denominator*secondRational.getDenominator();
        System.out.println(n+" "+d);
        return new Rational1(n,d);
    }
    public Rational1 subtract(Rational1 secondRational) {
        long n = numerator*secondRational.getDenominator()-denominator*secondRational.getNumerator();
        long d = denominator*secondRational.getDenominator();
        return new Rational1(n,d);
    }
    public Rational1 multiply(Rational1 secondRational) {
        long n = numerator*secondRational.getNumerator();
        long d = denominator*secondRational.getDenominator();
        return new Rational1(n,d);
    }
    public Rational1 divide(Rational1 secondRational) {
        long n = numerator*secondRational.getDenominator();
        long d = denominator*secondRational.getNumerator();
        return new Rational1(n,d);
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

