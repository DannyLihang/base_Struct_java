import java.util.Scanner;

public class test7 {
    /*
    7.编写bin2Dec（StringbinaryString）方法，将一个二进制字符串转换为一个十进制数。
    实现bin2Dec方法，在字符串不是一个二进制字符串时抛出NumberFormatException异常。
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int num = 0;
        num = bin2Dec(str);
        System.out.println(num);

    }
    public static int bin2Dec(String str){
        int num = 0;
        int flag = 1;
        for (int i = str.length() - 1; i >= 0 ; i--) {
            char ch = str.charAt(i) ;
            if(ch<'0'||ch>='2'){
                throw new NumberFormatException();
            }
            num += (ch- '0')*flag;
            flag *=2;
        }
        return num;
    }
}
