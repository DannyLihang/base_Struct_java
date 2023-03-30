public class test8 {
    public static void main(String[] args) {
        System.out.println(sqrt(2));
    }
    public static double sqrt(long n)
    {
        double nextGuess = 0.0;
        double lastGuess = 1.0;
        while ((lastGuess-nextGuess)>0.0001)
        {
            nextGuess = (lastGuess+n/lastGuess)/2;
        }
        return nextGuess;
    }
}
