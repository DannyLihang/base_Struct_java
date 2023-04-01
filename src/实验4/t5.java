import java.util.GregorianCalendar;

public class t5 {
    public static void main(String[] args) {
        GregorianCalendar r = new GregorianCalendar();
        System.out.printf(r.get(GregorianCalendar.YEAR)+"年");
        System.out.printf(r.get(GregorianCalendar.MONTH)+"月");
        System.out.printf(r.get(GregorianCalendar.DAY_OF_MONTH)+"日");
        System.out.println();
        r.setTimeInMillis(1234567898765L);
        System.out.printf(r.get(GregorianCalendar.YEAR)+"年");
        System.out.printf(r.get(GregorianCalendar.MONTH)+"月");
        System.out.printf(r.get(GregorianCalendar.DAY_OF_MONTH)+"日");
    }
}