import java.time.LocalDate;
import java.util.GregorianCalendar;

public class test12 {
    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        MyDate myDate1 = new MyDate(34355555133101L);
        System.out.println(myDate.getYear()+" "+ myDate.getMonth()+" "+myDate.getDay());
        System.out.println(myDate1.getYear()+" "+ myDate1.getMonth()+" "+myDate1.getDay());
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        LocalDate localTime = LocalDate.now();
        year = localTime.getYear();
        month = localTime.getMonthValue() - 1;//因为题目要求month从0开始代表1月
        day = localTime.getDayOfMonth();
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public MyDate(long elapsedTime){
        setDate(elapsedTime);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    //一个名为 setDate（long elapsedTime)使用流逝的时间为对象设置新数据的方法。
    public void setDate(long elapsedTime){
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(elapsedTime);
        this.year = gregorianCalendar.get(GregorianCalendar.YEAR);
        this.month = gregorianCalendar.get(GregorianCalendar.MONTH);
        this.day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

}
