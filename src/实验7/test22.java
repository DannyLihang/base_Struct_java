import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class test22 {
    /*
    22.编写一个程序，
   向一个名为Exercisel7_05.dat的文件中存储一个含5个int值1、2、3、4、5的数组，
   一个表示当前时间的Date对象，以及一个double值5.5。
     */
    public static void main(String[] args) throws IOException {
        File file = new File("Exercise17_05.dat");
        try(PrintWriter printWriter = new PrintWriter(file)){
            for (int i = 0; i < 5; i++) {
                data data = new data();
                printWriter.print(data);
            }
        }
    }
}
class data{
    private int []num = new int[]{1,2,3,4,5};
    private Date date = new Date();
    private double n = 5.5;

    public int[] getNum() {
        return num;
    }

    public Date getDate() {
        return date;
    }

    public double getN() {
        return n;
    }
}