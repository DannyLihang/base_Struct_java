public class test5 {
    public static void main(String[] args) {
        System.out.println("i\tm(i)");
        for (int i = 1; i < 21; i++) {
            System.out.printf("%d\t%.4f\n",i,calculate(i));
        }
    }
    public static double calculate(int i)
    {
        double sum = 0.0;
        for (int j = 1; j <= i; j++) {
            sum+=(double) j/(j+1);
        }
        return sum;
    }
}
