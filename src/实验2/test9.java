public class test9 {
    public static void main(String[] args) {
        System.out.printf("英里 千米    千米 英里\n");
        for(int i = 1,j = 20 ; i <=10 ; i++,j+=5)
        {
            System.out.printf("%d\t%.3f\t%d\t%.3f\n",i,1.609*i,j,12.430/20*j);
        }
    }
}
