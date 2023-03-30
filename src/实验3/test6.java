public class test6 {
    public static void main(String[] args) {
        printMatrix(3);
    }
    public static void printMatrix(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", (int) (2 * Math.random()));
            }
            System.out.println();
        }
    }
}
