import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class test12 {
    /*
    12.）假定一个文本文件中包含未指定个数的分数，用空格分开。
    编写一个程序，提示用户输入文件，然后从文件中读入分数，并且显示它们的和以及平均值。
     */
    public static void main(String[] args) throws IOException {
        //本题应该要用正则表达式 查资料分数形式为 if (str.matches("-?[0-9]+.?[0-9]*"))
        File file = new File("file.txt");
        Scanner scanner = new Scanner(file);
        double sum = 0.0;
        int count = 0;
        while (scanner.hasNext()){
            String str = scanner.next();
            if (str.matches("-?[0-9]+.?[0-9]*")){
                sum += Double.parseDouble(str);
                count++;
            }
        }
        scanner.close();
        System.out.println("the sum is "+sum+",the average is "+ sum/count);
    }
}
