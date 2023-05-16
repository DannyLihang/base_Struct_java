import java.util.*;
public class test04 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);

        int month = input.nextInt();
        int year = input.nextInt();
        int day = 1;

        Calendar c = new GregorianCalendar(year,month-1,day);

        int firstDay = c.get(Calendar.DAY_OF_WEEK);
        int dayOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);

        printMonthTitle(year,month);
        printMonthBody(year,month, firstDay, dayOfMonth);

        input.close();

    }

    public static void printMonthTitle(int year, int month) {
        System.out.println("             " + getMonthName(month)+ "  "+ year);
        System.out.println("-------------------------------------");
        System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat  ");
    }

    public static String getMonthName(int month) {
        String monthName = " ";
        switch(month) {
            case 1: monthName = "January"; break;
            case 2: monthName = "Febuary"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December";
        }

        return monthName;
    }

    public static void printMonthBody(int year, int month, int startDay, int dayOfMonth) {
        for(int i = 1; i< startDay;i++) {
            System.out.print("     ");
        }
        for(int i = 1;i <= dayOfMonth; i++) {
            if((i + startDay-2) % 7 ==0)
                System.out.println();
            if(i <10 ) {
                System.out.print(" ");
            }
            System.out.print("   "+ i );

        }
    }



}
