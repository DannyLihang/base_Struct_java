import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class test27 {
    /*
    编写一个程序，提示用户输入一个ASCII文本文件名，然后显示文件中每个字符出现的频率
     */
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter filename");
        String str = scanner.nextLine();
        File file = new File(str);
        int []count = new int[26];
        try(Scanner scanner1 = new Scanner(file)){
            while (scanner1.hasNext()){
                String str1 = scanner1.next();
                for (int i = 0; i < str1.length(); i++) {
                    for (int j = 0; j < 26; j++) {
                        if(str1.charAt(i) == 'A'+j){
                            count[j]++;
                        }
                    }
                }
            }
            for (int i = 0; i < 26; i++) {
                System.out.printf("Number of %c's %d\n",'A'+i,count[i]);
            }
        }
    }
}
