import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class test19 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a filename");
        Scanner scanner = new Scanner(System.in);
        String  file1 = scanner.nextLine();
        File file = new File(file1);
        int []count = new int[26];
        try(Scanner scanner1 = new Scanner(file)){
            while (scanner1.hasNext()){
                String str = scanner1.next();
                for (int i = 0; i < str.length(); i++) {
                    for (int j = 0; j < 26; j++) {
                        if(str.charAt(i) == 'A'+j){
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
