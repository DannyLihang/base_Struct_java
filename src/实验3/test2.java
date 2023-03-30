public class test2 {
    public static int sumDigits(int i)
    {
        int sum = 0;
        while (i!=0)
        {
            sum+=i%10;
            i/=10;
        }
        return sum;
    }
}
