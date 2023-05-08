import java.io.*;
import java.util.Scanner;

public class test26 {
    /*
    通过给文件中的每个字节加5来对文件编码。
    编写一个程序，提示用户输入一个输入文件名和一个输出文件名，然后将输入文件的加密版本存入输出文件。
     */
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        File file = new File(str1);
        File file1 = new File(str2);
        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        FileInputStream fileInputStream = new FileInputStream(file);
        int data = 0;
        while ((data = fileInputStream.read())!=-1) {
            data = data + 5;
            fileOutputStream.write(data);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
