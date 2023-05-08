import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test10 {
    /*
    10.OutOfMemoryError错误）编写一个程序，它能导致JVM抛出一个OutOfMemoryError，然后捕获和处理这个错误。
     */
    //文件未关闭
    public static void main(String[] args) {
        try {
            File file = new File("");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
