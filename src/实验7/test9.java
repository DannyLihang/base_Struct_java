import java.util.Scanner;

public class test9 {
    /*
    9.编程练习题320实现bin2Dec方法，在字符串不是一个二进制字符串时抛出BinaryFormatException异常。
    定义一个名为BinaryFormatException的自定义异常。
    实现bin2Dec方法，在字符串不是一个二进制字符串时抛出BinaryFormatException异常。
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        bin2Dec(str);

    }
    public static void bin2Dec(String str){
        try {
            int num = 0;
            int flag = 1;
            for (int i = str.length() - 1; i >= 0 ; i--) {
                char ch = str.charAt(i) ;
                if(ch<'0'||ch>='2'){
                    throw new BinaryFormatException("it is not a binary format");
                }
                num += (ch- '0')*flag;
                flag *=2;
            }
            System.out.println("The decimal value for hex number " + str + " is " + num);
        } catch (BinaryFormatException e) {
            throw new RuntimeException(e);
        }

    }
}
class BinaryFormatException extends Exception{
    BinaryFormatException(String str){
        super(str);
    }
}
