import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a credit card number as a long integer:");
        long number = scanner.nextLong();
        if(isValid(number)) System.out.println(number+" is valid");
        else System.out.println(number+" is invalid");
    }
    public static int sumOfDoubleEvenPlace(long number)
    {
        int res1 = 0;number/=10;
        while (number!=0)
        {
            res1 += getDigit((int)(number%10)*2);
            number/=100;
        }
        return res1;
    }
    public static int sumOfOddPlace(long number)
    {
        int res2 = 0;
        while (number!=0){
            res2 += (int)(number%10);
            number/=100;
        }
        return res2;
    }
    public static boolean isValid(long number)
    {
        if(getSize(number)<13||getSize(number)>16)
            return false;
        //long sum = number;
        /*int res1 = 0;
        number/=10;
        while (number!=0)
        {
            res1 += getDigit((int)(number%10)*2);
            number/=100;
        }*/
        /*int res2 = 0;
        while (sum!=0){
            res2 += (int)(sum%10);
            sum/=100;
        }*/
        if((sumOfDoubleEvenPlace(number)+sumOfOddPlace(number))%10 == 0)
            return true;
        else return false;
    }
    public static int getDigit(int num ){
        return num%10+(num/10);
    }
    public static int getSize(long number)
    {
        int count = 0;
        while (number!=0){
            count++;number/=10;
        }
        return count;
    }
}
