import java.math.BigDecimal;

public class test17 {
    public static void main(String[] args) {
            int[] arr = new int[50];
            int count = 0;
            for (int i = 2 ; i < 100 ; i++){
                if (isPrime(i)){
                    arr[count] = i;
                    count++;
                }
            }
            int[] arr1 = new int[count];
            for (int i = 0 ; i < count ; i++){
                arr1[i] = arr[i];
            }
            arr = arr1;
            System.out.println("p\t2^p-1");
            BigDecimal[] num = new BigDecimal[count];
            double temp = 0;
            for (int i = 0 ; i < count ; i++){
                temp = Math.pow(2, arr[i]) - 1;
                if (isPrime(temp)){
                    String str = temp+"";
                    BigDecimal bit = new BigDecimal(str);
                    num[i] = bit;
                    System.out.printf("%d\t%d\n", arr[i], (int) temp);
                } else {
                    num[i] = new BigDecimal("-2");
                }
            }
            for (int i = 0 ; i < count ; i++){
                if (num[i].equals(new BigDecimal("2"))){
                    for (int a = i ; a < count ; a++){
                        num[a] = num[a+1];
                    }
                }
            }
        }
        public static boolean isPrime(double num){
            for (int i = 2 ; i *i<= num ; i++){
                if (num % i == 0){
                    return false;
                }
            }
            return true;
    }
}
