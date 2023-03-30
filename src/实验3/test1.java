public class test1 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if(count%10 == 0) System.out.println();

            System.out.printf("%d ",i*(3*i-1)/2);
            count++;
        }
    }
}
