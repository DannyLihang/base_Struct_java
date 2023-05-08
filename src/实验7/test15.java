import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class test15 {
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
