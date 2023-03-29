public class test12 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 8 ; i++)
        {
                for(int j = 1 ; j <= 8-i; j++)
                {
                    System.out.printf("\t");
                }
                int n = 1;
                for(int k = 1 ; k <= i ; k++)
                {
                    System.out.printf("%3d\t",(n*=2)/2);
                }
                int q = n/2;
                for(int m = 1; m <= i-1 ; m++)
                {
                    System.out.printf("%d\t",q/=2);
                }
                System.out.println();
            }
        }
}
