import java.util.ArrayList;
import java.util.Date;

public class test6 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Date date = new Date();
        String s = new String();
        arrayList.add(date);
        arrayList.add(s);
        for (Object a:arrayList) {
            System.out.println(a);
        }

    }
}
