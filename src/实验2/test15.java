import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("year :");
        int year = scanner.nextInt();
        System.out.println("week:");
        int week = scanner.nextInt();
        String []str = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        for(int i = 0;i < str.length ; i++)
        {
            System.out.println("\t"+str[i]+year);
            System.out.println("----------------------------");
            System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
            printDay(year,str[i],week);//打印天数
            System.out.println();//换行
        }
    }
    public static void printDay(int year , String str , int week)
    {
        int day = 0;
        int flag = 0;
        if(isLeap(year)) flag = 1;
        switch (str)
        {
            case "January":day=31;break;
            case "February":day=28+flag;break;
            case "March":day = 31;break;
            case "April":day = 30;break;
            case "May":day = 31;break;
            case "June":day = 30;break;
            case "July":day = 31;break;
            case "August":day = 31;break;
            case "September":day = 30;break;
            case "October":day = 31;break;
            case "November":day = 30;break;
            case "December":day = 31;break;
        }
        for(int i = 0 ; i< week ; i++)//打印空格
        {
            System.out.printf("\t");
        }
        for(int i = 1 ; i <= day;i++)
        {
            System.out.printf("%2d\t",i);
            if((i+week)%7 == 0)
                System.out.println();
        }
    }
    public static boolean isLeap(int year)
    {
        if((year%4==0&&year%100!=0)||(year%400==0)) return true;
        else return false;
    }
}