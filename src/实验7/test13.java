import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class test13 {
    /*
    13.编写一个程序，如果名为Exercise12_15.txt的文件不存在，则创建该文件。
    使用文本I/O将随机产生的100个整数写入文件，文件中的整数由空格分开。从文件中读回数据并以升序显示数据。
     */
    public static void main(String[] args) throws IOException {
        File file = new File("Exercise12_15.txt");
        Scanner scanner = new Scanner(file);
        if(!file.exists()){
            PrintWriter printWriter = new PrintWriter("Exercise12_15.txt");
            for (int i = 0; i < 100; i++) {
                 printWriter.print((int) (Math.random()*10));
                 printWriter.close();
            }
        }
        int []nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%d ",nums[i]);
        }
    }
}
