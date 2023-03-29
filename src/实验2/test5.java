import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = scanner.nextInt();
        System.out.println("Enter a month (first three letters with the first letter in uppercasr):");
        String str = scanner.next();
        int day =0;
        int i = 0;
        if(isLeap(year)) i++;
        switch (str)
        {
            case "Jan":day = 31;break;
            case "Feb":day = 28+i;break;
            case "Mar":day = 31;break;
            case "Apr":day = 30;break;
            case "May":day = 31;break;
            case "Jun":day = 30;break;
            case "Jul":day = 31;break;
            case "Aug":day = 31;break;
            case "Sep":day = 30;break;
            case "Oct":day = 31;break;
            case "Nov":day = 30;break;
            case "Dec":day = 31;break;
        }
        System.out.printf("%s %d has %d days",str,year,day);
    }
    public static boolean isLeap(int year)
    {
        if((year%4==0&&year%100!=0)||(year%400==0)) return true;
        else return false;
    }


}
