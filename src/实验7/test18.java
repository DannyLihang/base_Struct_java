import java.io.File;

public class test18 {
    /*
    假定在某个目录下面有多个文件，命名为Exercisei_j，其中i和j是数字。
    编写一个程序，如果j是个位数，则在j前面插入一个0。例如，目录中的文件Exercise2_1将被改名为Exercise2_01。
     */
    public static void main(String[] args) {
        File file = new File("F:/java.idea");
        String []fileName = file.list();
        for (int i = 0; i < fileName.length; i++) {
            int n = fileName.length - 10;
            if(n==1){
                StringBuffer stringBuffer = new StringBuffer(fileName[i]);
                stringBuffer.insert(10,'0');
            }
        }

    }
}
