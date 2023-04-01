import java.text.SimpleDateFormat;
import java.util.Date;

public class t3 {
    public static void main(String[] args) {
        System.out.println(toString(10000));
        System.out.println(toString(100000));
        System.out.println(toString(1000000));
        System.out.println(toString(10000000));
        System.out.println(toString(100000000));
        System.out.println(toString(1000000000));
    }
    public static String toString(long d)
    {
        Date date = new Date();
        date.setTime(date.getTime()+d);
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return f.format(date);
    }
}
