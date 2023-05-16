import java.math.BigInteger;
public class test14 {
    /**
     * （在 Rarional 类中使用 BigInteger）使用 BigInteger 表示分子和分母，重新设计和实现程
     * 序清单 13-13（参见教材 P449）中的 Rational 类
     */
}
class Rational extends Number implements Comparable {
    private BigInteger numerator;// 分子
    private BigInteger denominator;// 分母

    public Rational() {
        this(BigInteger.ZERO, BigInteger.ONE);
    }

    public Rational(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = gcd(numerator, denominator);
        this.numerator = ((denominator.compareTo(BigInteger.ZERO)) > 0 ? BigInteger.ONE
                : new BigInteger(-1 + "")).multiply(numerator).divide(gcd);
        this.denominator = denominator.abs().divide(gcd);
    }

    public static BigInteger gcd(BigInteger a, BigInteger b) {
        BigInteger n1 = a.abs();
        BigInteger n2 = b.abs();
        BigInteger remainder = n1.remainder(n2);
        while (remainder.compareTo(BigInteger.ZERO) > 0) {
            n1 = n2;
            n2 = remainder;
            remainder = n1.remainder(n2);
        }
        return n2;
    }

    public BigInteger getNumerator() {
        return numerator;
    }

    public BigInteger getDenominator() {
        return denominator;
    }

    public Rational add(Rational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator()).add(
                denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    public Rational subtract(Rational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator())
                .subtract(denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    public Rational multiple(Rational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getNumerator());
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    public Rational divide(Rational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator());
        BigInteger d = denominator.multiply(secondRational.getNumerator());
        return new Rational(n, d);
    }

    @Override
    public boolean equals(Object obj) {
// TODO Auto-generated method stub
        if (this.getNumerator().compareTo(((Rational) obj).getNumerator()) == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
// TODO Auto-generated method stub
        if (denominator.compareTo(BigInteger.ONE) == 0) {
            return numerator.toString();
        } else {
            return numerator.toString() + "/" + denominator.toString();
        }
    }

    @Override
    public int intValue() {
// TODO Auto-generated method stub
        return numerator.divide(denominator).intValue();
    }

    @Override
    public long longValue() {
// TODO Auto-generated method stub
        return numerator.divide(denominator).longValue();
    }

    @Override
    public float floatValue() {
// TODO Auto-generated method stub
        return numerator.divide(denominator).floatValue();
    }

    @Override
    public double doubleValue() {
// TODO Auto-generated method stub
        return numerator.divide(denominator).doubleValue();
    }

    @Override
    public int compareTo(Object o) {
// TODO Auto-generated method stub
        if (this.getNumerator().compareTo(((Rational) o).getNumerator()) > 0) {
            return 1;
        } else if (this.getNumerator().compareTo(((Rational) o).getNumerator()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}