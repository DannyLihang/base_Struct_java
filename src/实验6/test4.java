import java.util.ArrayList;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个以0结尾的数值序列：");
        int num = scanner.nextInt();
        while (num!=0){
            integers.add(num);
            num = scanner.nextInt();
        }
        int res = (int) max(integers);
        System.out.println("最大数值为："+res);
    }
    public static Integer max(ArrayList<Integer> list){
        if(list == null || list.size() == 0)
            return 0;
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i)>max){
                max = list.get(i);
            }
        }
        return max;
    }
}
