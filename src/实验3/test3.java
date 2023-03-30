public class test3 {
    public static void main(String[] args) {
        double j = 20.0;
        System.out.println("英尺\t米\t\t米\t\t英尺");
        for (double i = 1; i <= 10; i++) {
            System.out.printf("%.1f\t%.3f\t%.1f\t%.3f\n",i,footToMeter(i),j,meterToFoot(j));
            j+=5;
        }
    }
    public static double footToMeter(double foot)
    {
        return 0.305*foot;
    }
    public static double meterToFoot(double meter)
    {
        return 3.279*meter;
    }
}
