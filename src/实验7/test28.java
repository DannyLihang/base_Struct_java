import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test28 {
    /*
    28.（BitOutputStream）实现一个名为BitOutputStream的类，如下图所示，将比特写入一个输出流。
    方法writeBit（char bit）存储一个字节变量形式的比特。创建一个BitOutputStream时，该字节是空的。
    在调用writeBit（'1'）之后，这个字节就变成00000001。在调用writeBit（"0101"）之后，这个字节就变成00010101。
    前三个字节还没有填充。当字节填满后，就发送到输出流。现在，字节重置为空。必须调用close（）方法关闭这个流。
    如果这个字节非空也非满close（）方法就会先填充0以使字节的8个比特都被填满，然后输出字节并关闭这个流。
    可以参见编程练习题138得到提示。
    编写一个测试程序，将比特010000100100001001101发送给一个名为Exercise17_17.dat的文件。
     */
}
class BitOutputStream extends FileOutputStream {
    private String aByte;
    private FileOutputStream fileOutputStream;
    public BitOutputStream(File file) throws FileNotFoundException {
        super(file);
    }

    public void writeBit(char bit){
        aByte = "0000000"+bit;
    }

    public void writeBit(String bit){
        aByte = "0000"+bit;
    }

    public void close(){
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}