import java.util.Scanner;

public class test6 {
    /*

6.（NumberFormatException异常）程序淸单6-8（参见教材P184）实现了hexToDec（StringhexString）方法，
它将一个十六进制字符串转换为一个十进制数。
实现这个hexToDec方法，在字符串不是一个十六进制字符串时抛出NumberFormatException异常。
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        hexToDec(str);
    }
    public static void hexToDec(String str){
        int num = 0;
        try{
            for(int i = 0;i <  str.length(); ++i){
                char hexChar =  str.charAt(i);
                if(hexChar >= '0' && hexChar <= '9'){
                    num = num * 16 + hexChar - '0';
                }else if( hexChar >= 'A' && hexChar <= 'F'){
                    num = num * 16 + hexChar - 'A' + 10;
                }else{
                    throw new NumberFormatException();
                }
            }
            System.out.println("The decimal value for hex number " + str + " is " + num);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
