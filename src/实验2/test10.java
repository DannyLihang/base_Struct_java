import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of student:");
        int num = scanner.nextInt();
        int tops = 0 ;String topn = "";
        int dtops = 0 ; String dtopn = "";
        int ts = 0;String tn = "";
        for(int i = 0 ; i < num ; i++)
        {
            System.out.println("Enter name:");
            tn = scanner.next();
            System.out.println("Enter score:");
            ts = scanner.nextInt();
            if(ts > tops) //顺移
            {
                dtopn = topn;
                dtops = ts;
                topn =tn;
                tops =ts;
                continue;
            }
            if( ts > dtops)
            {
                dtopn = tn;
                dtops = ts;
            }
        }
        System.out.println("highest name:"+topn+" score:"+tops);
        System.out.println("second_highest name:"+dtopn+" score:"+dtops);
    }
}