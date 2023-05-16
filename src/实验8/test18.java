import java.math.BigInteger;
import java.util.Scanner;

public class test18 {
}
public class Rational extends Number implements Comparable {
    private BigInteger numberator = new BigInteger("0");
    private BigInteger denominator = new BigInteger("1");


    public Rational() {
        this(0,1);
    }

    public Rational(long numerator,long denominator) {
        long gcd = gcd(numerator,denominator);
        this.numberator = BigInteger.valueOf(((denominator > 0)? 1 : -1) * numerator / gcd);
        this.denominator = BigInteger.valueOf(Math.abs(denominator) / gcd);
    }

    public static long gcd(long numerator,long denominator) {
        long gcd = 1;
        for(long i = 1;i <= Math.abs(numerator) && i <= denominator;i++) {
            if(numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public long getNumerator() {
        return numberator.longValue();
    }

    public long getDenominator() {
        return denominator.longValue();
    }

    public Rational add(Rational secondRational) {
        long n = numberator.longValue() * secondRational.getDenominator()
                + denominator.longValue() * secondRational.getNumerator();
        long m = denominator.longValue() * secondRational.getDenominator();
        return new Rational(n,m);
    }

    public Rational subtract(Rational secondRational) {
        long n = numberator.longValue() * secondRational.getDenominator()
                - denominator.longValue() * secondRational.getNumerator();
        long m = denominator.longValue() * secondRational.getDenominator();
        return new Rational(n,m);
    }

    public Rational multiply(Rational secondRational) {
        long n = numberator.longValue() * secondRational.getNumerator();
        long m = denominator.longValue() * secondRational.getDenominator();
        return new Rational(n,m);
    }

    public Rational divide(Rational secondRational) {
        long n = numberator.longValue() * secondRational.getDenominator();
        long m = denominator.longValue() * secondRational.getNumerator();
        return new Rational(n,m);
    }

    @Override
    public String toString() {
        if(denominator.longValue() == 1)
            return numberator.longValue() + "";
        else
            return numberator.longValue() + "/" + denominator.longValue();
    }

    @Override
    public boolean equals(Object object) {
        return (this.subtract((Rational)(object)).getNumerator()) == 0 ? true : false;
    }

    @Override
    public int intValue() {
        return (int)doubleValue();
    }

    @Override
    public float floatValue() {
        return (float)doubleValue();
    }

    @Override
    public double doubleValue() {
        return numberator.longValue() * 1.0 / denominator.longValue();
    }

    @Override
    public long longValue() {
        return (long)doubleValue();
    }
    public int compareTo(Object o){
        if(this.subtract((Rational) o).getNumerator() > 0)
            return 1;
        else if(this.subtract((Rational)o).getNumerator() < 0)
            return -1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        String num = input.next();
        String[] nums = num.split("\\.");
        Rational num1 = new Rational(Long.parseLong(nums[0]),1);
        Rational result;
        if(nums.length == 2) {
            Rational num2 = new Rational((long)(num.charAt(0) == '-' ? -1 : 1) * Long.parseLong(nums[1]),(long)Math.pow(10, nums[1].length()));
            result = num1.add(num2);
        }else {
            result = num1;
        }
        System.out.println("The fraction number is " + result.getNumerator() + "/" + result.getDenominator());

    }

}