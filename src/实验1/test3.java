public class test3 {
    public static void main(String[] args) {
        double sum = 0.0;
        int i = 1;
        int flag = 1;
        for(i = 1 ;(1.0/i)>=1e-6 ;i+=2)
        {
            sum += flag*1.0/i;
            flag = -flag;
        }
        System.out.println(4*sum);
    }
}
