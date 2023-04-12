import java.math.BigDecimal;
import java.math.RoundingMode;
public class test18 {
    public static void main(String[] args) {
        BigDecimal num = new BigDecimal("1.000000000000000000000000");
        BigDecimal temp;
        for (int i = 100 ; i <= 1000 ; i += 100){
            temp = num.add(calculate(i));
            System.out.println(temp);
        }
    }
    public static BigDecimal calculate (int num){
        BigDecimal t = new BigDecimal("1"), te, ti;
        BigDecimal res = new BigDecimal("0");
        BigDecimal my_one = new BigDecimal("1.000000000000000000000000");
        for (int i = 1 ; i <= num ; i++){
            ti = new BigDecimal(i + "");
            t = t.multiply(ti);
            te = my_one.divide(t, 24, RoundingMode.HALF_UP);
            res = res.add(te);
        }
        return res;
    }
}
