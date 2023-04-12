import java.math.BigDecimal;

public class test19 {
    public static void main(String[] args) {
        BigDecimal num = new BigDecimal(Long.MAX_VALUE);
        int count = 0;
        for (BigDecimal i = num; count <10;i.add(BigDecimal.ONE)){
            if(i.divide(new BigDecimal(5)).equals(0) && i.divide(new BigDecimal(6)).equals(0)){
                System.out.println(i);
            }
        }
    }
}
