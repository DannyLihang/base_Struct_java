public class test14 {
    public static void main(String[] args) {
        double sum = 0.0;
        for(int i = 1 ; i <= 97 ; i+=2)
        {
            sum+= i/(i+2.0);
        }
        System.out.println(sum);
    }
}
