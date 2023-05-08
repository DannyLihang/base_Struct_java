import java.util.Scanner;

public class test11 {
    /*
    11.编写一个程序，从一个文本文件中删掉所有指定的某个字符串。
    例如，调用java Exercise12_ll John filename，从指定文件中删掉字符串John。程序从命令行获得参数。
     */
    public static void main(String[] args) {
        //先读文件到一个字符串中，再用另一个字符串除去目标字符串
        Scanner scanner = new Scanner("Exercise12_ll");
        String str = "";
        String str1 = "";
        while (scanner.hasNext()){
            str+=scanner.nextLine();
            str1+=str.replaceAll("john","");
        }
        scanner.close();
    }
}
