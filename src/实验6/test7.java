import java.util.ArrayList;
import java.util.Collections;

public class test7 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        shuffle(integers);
        System.out.println(integers);
    }
    public static void shuffle(ArrayList<Integer> list){
        Collections.shuffle(list);
    }
}
