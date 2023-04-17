import java.util.ArrayList;
import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size n:");
        ArrayList<Integer> integers1 = new ArrayList<>();//行，用于存储1的个数
        ArrayList<Integer> integers2 = new ArrayList<>();//列，用于存储1的个数
        ArrayList<Integer> list1 = new ArrayList<>();//行，用于存储最大的下标
        ArrayList<Integer> list2 = new ArrayList<>();//列，用于存储最大的下标
        int n = scanner.nextInt();
        int [][]arr = new int[n][n];
        System.out.println("The random array is");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int) (Math.random()*2);
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }
        //思路简单，但空间的占用较大，可寻找更简单的思路
        //遍历行
        for (int i = 0; i < 4; i++) {
            int count_h = 0;
            for (int j = 0; j < 4; j++) {
                if(arr[i][j] == 1){
                    count_h++;
                }
            }
            integers1.add(count_h);
        }
        //遍历列
        for (int i = 0; i < 4; i++) {
            int count_l = 0;
            for (int j = 0; j < 4; j++) {
                if(arr[j][i] == 1){
                    count_l++;
                }
            }
            integers2.add(count_l);
        }
        for (int i = 0; i < integers1.size(); i++) {
            if(integers1.get(i) == getMax(integers1)){
                list1.add(i);
            }
        }
        for (int i = 0; i < integers2.size(); i++) {
            if(integers2.get(i) == getMax(integers2)){
                list2.add(i);
            }
        }
        System.out.println("The largest row index:"+list1);
        System.out.println("The largest column index:"+list2);
    }
    public static int getMax(ArrayList<Integer> list){
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i)>max)
                max = list.get(i);
        }
        return max;
    }

}
