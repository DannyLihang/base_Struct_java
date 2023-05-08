import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class test29 {
    /*
    编写一个程序，提示用户输入文件名，从文件读取字节，然后显示每个字节的十六进制表示形式。
    提示：可以先将字节值转换为一个8比特的字符串，然后再将比特字符串转换为一个两位的十六进制字符串。
     */
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter filename");
        String str = scanner.nextLine();
        File file = new File(str);
        FileInputStream fileInputStream = new FileInputStream(file);
        int data = 0;
        while ((data = fileInputStream.read()) != -1){
            System.out.println(Integer.toHexString(data));
        }
        fileInputStream.close();
    }
}
