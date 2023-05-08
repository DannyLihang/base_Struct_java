import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class test16 {
    public static void main(String[] args) throws IOException {
        //本题应该要用正则表达式 查资料分数形式为 if (str.matches("-?[0-9]+.?[0-9]*"))
        File file = new File("http://cs.armstrong.edu/liang/data/Scores.txt");
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
