public class test15 {
    public static void main(String[] args) {
        int []counts = new int[10];
        for (int i = 0; i < 100; i++) {
            int num = (int)(Math.random()*10);
            counts[num]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ",counts[i]);
        }
    }
}
