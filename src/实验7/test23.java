import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class test23 {
    /*
    23.假设要追踪一个程序的运行次数。可以存储一个int值来对文件计数。
    程序每执行一次计数器就加1。将程序命名为Exercise17_08，并且将计数器存储在文件Exercise17_08.dat中。
     */
    public static void main(String[] args) throws IOException {
        File file = new File("Exercise17_08.dat");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        int count = 0;
        count++;
        fileOutputStream.write(count);
        fileOutputStream.close();
    }
}
