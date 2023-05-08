import java.util.Scanner;

public class test8 {
    /*
    8.编程练习题319实现hex2Dec方法，在字符串不是一个十六进制字符串时抛出NumberFormatException异常。
    定义一个名为HexFormatException的自定义异常。
    实现hex2Dec方法，在字符串不是一个十六进制字符串时抛出HexFormatException异常。
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        hex2Dec(str);
    }
    public static void hex2Dec(String str){
        int num = 0;
        try{
            for(int i = 0;i <  str.length(); ++i){
                char hexChar =  str.charAt(i);
                if(hexChar >= '0' && hexChar <= '9'){
                    num = num * 16 + hexChar - '0';
                }else if( hexChar >= 'A' && hexChar <= 'F'){
                    num = num * 16 + hexChar - 'A' + 10;
                }else{
                    throw new HexFormatException();
                }
            }
            System.out.println("The decimal value for hex number " + str + " is " + num);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
class HexFormatException extends Exception{
}
