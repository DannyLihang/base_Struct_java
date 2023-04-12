import java.time.LocalTime;

public class test01 {
    /*
    (时间类 Time)设计一个名为 Time 的类。这个类包含：
 表示时间的数据域 hour、minute 和 second。
 一个以当前时间创建 Time 对象的无参构造方法（数据域的值表示当前时间）。
 一个构造 Time 对象的构造方法，这个对象有一个特定的时间值，这个值是以毫秒表示
的、从 1970 年 1 月丨日午夜开始到现在流逝的时间段（数据域的值表示这个时间）。
 一个构造带特定的小时、分钟和秒的 Time 对象的构造方法。
 三个数据域 hour、minute 和 second 各自的 get 方法。
 一个名为 setTime(long elapseTime)的方法，使用流逝的时间给对象设置一个新时间。例
如，如果流逝的时间为 555550000 毫秒，则转换为 10 小时、10 分钟、10 秒。
实现这个类。编写一个测试程序，创建两个 Time 对象（使用 newTime()和 new
Time(555550000)), 然后显示它们的小时、分钟和秒。
提示：前两个构造方法可以从流逝的时间中提取出小时、分钟和秒。对于无参构造方法，
当前时间可以使用 System.currentTimeMills()获取当前时间
     */
    public static void main(String[] args) {
        //编写一个测试程序，创建两个 Time 对象（使用 newTime()和 new
        //Time(555550000)), 然后显示它们的小时、分钟和秒。
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        System.out.println(time1.setTime());
        System.out.println(time2.setTime());

    }
}
/*
表示时间的数据域 hour、minute 和 second。
 一个以当前时间创建 Time 对象的无参构造方法（数据域的值表示当前时间）。
 一个构造 Time 对象的构造方法，这个对象有一个特定的时间值，这个值是以毫秒表示
的、从 1970 年 1 月丨日午夜开始到现在流逝的时间段（数据域的值表示这个时间）。
 一个构造带特定的小时、分钟和秒的 Time 对象的构造方法。
 三个数据域 hour、minute 和 second 各自的 get 方法。
 */
class Time{
    public int hour;
    public int minute;
    public int second;
    public  long millisecond = 0;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public Time() {
        this.hour = LocalTime.MAX.getHour();
        this.minute = LocalTime.MAX.getMinute();
        this.second = LocalTime.MAX.getSecond();
        this.millisecond = System.currentTimeMillis();
    }

    public Time(long seconds){//一个构造带特定的小时、分钟和秒的 Time 对象的构造方法
        this.millisecond = seconds;
    }

    //一个名为 setTime(long elapseTime)的方法，使用流逝的时间给对象设置一个新时间。例
    //如，如果流逝的时间为 555550000 毫秒，则转换为 10 小时、10 分钟、10 秒。
    public String setTime(){
        if(this.millisecond < 1000)
            return "0秒"+ this.millisecond;
        long seconds = this.millisecond/1000;
        this.hour = (int) seconds /3600;
        this.minute = (int) seconds%3600/60;
        this.second = (int) seconds%3600%60;
        return this.hour+"小时"+this.minute+"分钟"+this.second+"秒";
    }

}