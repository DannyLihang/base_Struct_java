import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class test20 {
    public static void main(String[] args) throws IOException{
        File file = new File("Exercise17_01.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try (PrintWriter pw = new PrintWriter(file)){
            String str = "";
            for (int i = 0; i < 100; i++) {
                str+=(int)(Math.random()*10)+" ";
            }
            pw.print(str);
        }
    }
}
