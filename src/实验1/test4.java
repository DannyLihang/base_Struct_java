public class test4 {
    public static void main(String[] args) {
        int sum = 312032486;
        double b = 1.0/7;
        double d = 1.0/13;
        double q = 1.0/45;
        int year = 365*24*60*60;
        for(int i = 1; i <= 5 ; i++)
        {
            sum+=year*(b-d+q);
            System.out.printf("第%d年:%d\n",i,sum);
        }
    }
}
