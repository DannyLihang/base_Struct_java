import java.util.*;

public class test03 {
    /**
     * （排序 ArrayList）编写以下方法，对 ArrayList 里面保存的数字进行排序。
     * public static void sort（ArrayList<Number> list）
     */
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        sort(list);
        System.out.println("====");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static void sort(ArrayList<Number> list){
        ArrayList<Integer> integers = new ArrayList<>();
        Collections.sort(integers);
        for (int i = 0; i < list.size(); i++) {
            //int num = (int) list.get(i);
            integers.add((int) list.get(i));
        }
        Collections.sort(integers);
        for (int i = 0; i < list.size(); i++) {
            //int num = (int) list.get(i);
            list.set(i,integers.get(i));
        }
    }

}
