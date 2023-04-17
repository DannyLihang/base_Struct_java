import java.util.ArrayList;
import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入五个数字");
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            integers.add(scanner.nextInt());
        }
        sort(integers);
        System.out.println(integers);
    }
    public static void sort(ArrayList<Integer> list){
        //使用冒泡排序
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j <list.size()-i; j++) {
                //取出两个数
                Integer integer1 = list.get(j);
                Integer integer2 = list.get(j-1);

                if(list.get(j)<list.get(j-1)){
                    //交换
                    list.set(j,integer2);
                    list.set(j-1,integer1);
                }
            }
        }
    }
}
