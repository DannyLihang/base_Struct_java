import java.math.BigDecimal;

public class test16 {
    public static void main(String[] args) {
        BigDecimal n = new BigDecimal(Long.MAX_VALUE);
        int count = 0;
        while (count < 5){
            n = n.add(BigDecimal.ONE);
            if (isPrime(n)){
                System.out.println(n);
                count++;
            }
        }
    }
    public static boolean isPrime(BigDecimal n){
        BigDecimal i;
        for (BigDecimal temp = new BigDecimal("2"); !temp.equals(n.divide(new BigDecimal("2"))); temp = temp.add(BigDecimal.ONE)) {
            i = n.remainder(temp);
            if (n.equals(BigDecimal.ONE)){
                return false;
            }
        }
        return true;
    }

}
