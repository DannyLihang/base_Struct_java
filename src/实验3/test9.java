public class test9 {
    public static void main(String[] args) {
        System.out.print("p\t2^p-1\n");
        for (int i = 2; i <= 31; i++) {
            if(isdes(i)){
                System.out.printf("%d\t%d\n",i,(int)Math.pow(2,i)-1);
            }
        }
    }
    public static boolean isdes(int n)
    {
        int  a =(int) Math.pow(2,n)-1;
        for (int i = 2; i*i <= a ; i++) {
            if(a%i == 0) return false;
        }
        return true;
    }
}
