public class test10 {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            if(isPrime(i)&&isPrime(i+2)) {
                System.out.printf("(%d,%d)\n",i,i+2);
            }
        }
    }
    public static boolean isPrime(int n)
    {
        for (int i = 2; i*i <= n ; i++) {
            if(n%i == 0) return false;
        }
        return true;
    }
}

