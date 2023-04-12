import java.math.BigDecimal;

public class test15 {
    public static void main(String[] args) {
        /*
        找出大于 Long.MAX_VALUE 的前 10 个平方数。平方数是指形式为 n
2的数。
例如，4、9 以及 16 都是平方数。找到一种方法，使你的程序能快速运行。
         */
        BigDecimal bigDecimal = new BigDecimal(Long.MAX_VALUE);
        int count = 0;
        while (count<10){
            bigDecimal = bigDecimal.add(BigDecimal.ONE);
            if(isSquare(bigDecimal)){
                System.out.println(bigDecimal);
                count++;
            }
        }
    }
    public static boolean isSquare(BigDecimal b){
        BigDecimal i = new BigDecimal("1e10");
        for (BigDecimal j = new BigDecimal("1e9"); !j.equals(i); j.add(BigDecimal.ONE)) {
            if(j.pow(2).equals(b))
                return true;
        }
        return false;
    }
}
