public class test14 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; ; i++) {
            if(i%2 == 0 || (i/10+i%10+1)%3 == 0)
            {
                System.out.println("1.0e49+"+i);
                count++;
            }
            if(count == 10) break;
        }
    }
}
