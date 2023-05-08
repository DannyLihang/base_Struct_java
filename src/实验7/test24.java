
import java.io.*;
import java.util.Properties;

public class test24 {
    public static void main(String[] args) throws IOException {
        Properties pro=new Properties();
        File file=new File("exercise1_4.dat");
        if(!file.exists()) file.createNewFile();
        BufferedReader br=new BufferedReader(new FileReader(file));
        pro.load(br);
        int count=0;
        String value=pro.getProperty("times");
        if(value!=null) {
            count=Integer.parseInt(value);
        }
        count++;
        pro.setProperty("times",count+"");
        BufferedWriter bw=new BufferedWriter(new FileWriter(file));
        pro.store(bw,"");
        bw.close();
        br.close();
        System.out.println("启动次数："+count);
    }
}
