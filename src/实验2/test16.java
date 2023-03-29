public class test16 {
    public static void main(String[] args) {
        for(int i = 1 ; i <=10000 ;i++)
        {
            if(isW(i))
                System.out.println(i);
        }
    }
    public static boolean isW(int i)
    {
        int sum = 0;
        for(int j = 1 ; j < i ; j++)
        {
            if(i%j == 0)
                sum+=j;
        }
        return sum==i;
    }
}
