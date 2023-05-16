import java.util.ArrayList;
import java.util.Collections;

public class test02 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        shuffle(list);
        System.out.println("====");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static void shuffle(ArrayList<Number> list){
        Collections.shuffle(list);
    }
}
