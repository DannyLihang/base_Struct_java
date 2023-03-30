public class test17 {
    public static int getRandom(int...numbers)
    {
        int a = (int) (Math.random()*54+1);
        while (isHave(a,numbers))
        {
            a = (int) (Math.random()*54+1);
        }
        return a;
    }
    public static boolean isHave(int n ,int []numbers)
    {
        for (int i = 0; i < numbers.length; i++) {
            if(n == numbers[i]) return true;
        }
        return false;
    }
}
