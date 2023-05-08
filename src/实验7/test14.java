import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class test14 {
    /*
    假设在目录chapterl，chapter2，…，chapter34下面有Java源文件。
    编写一个程序，对在目录chapter1下面的Java源文件的第一行添加语句"pachage chapteri;"。
    假定chapterl，chapter2，…，chapter34在根目录srcRootDirectory下面。
    根目录和chapter1目录可能包含其他目录和文件。
     */
    public static void main(String[] args) throws IOException {
        File file = new File("SortedStringS.txt");
        try ( Scanner scanner = new Scanner(file)) {
            ArrayList<String> arrayList = new ArrayList<>();
            while (scanner.hasNext()) {
                arrayList.add(scanner.next());
            }
            for (int i = 0; i < arrayList.size() - 1; i++) {
                if(arrayList.get(i).compareTo(arrayList.get(i+1))>0){
                    System.out.println(arrayList.get(i)+" "+arrayList.get(i+1));
                    break;
                }
            }
        }
    }
}
