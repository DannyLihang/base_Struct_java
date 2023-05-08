import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class test17 {
    public static void main(String[] args) throws IOException {
        File file = new File("Salary.txt");
        String GardeName;
        try(PrintWriter printWriter = new PrintWriter(file);){
            StringBuilder test = new StringBuilder();
            for (int i = 1; i <= 1000; i++) {
                test.append("FirstName" + i + " LastName" + i);
                GardeName = getGradeName((int) (Math.random() * 3 + 1));
                test.append(" "+GardeName);
                test.append(" "+getSalary(GardeName));
                printWriter.println(test.toString());
            }
        }
    }
    public static String getGradeName(int i){
        switch (i){
            case 1:return "assistant";
            case 2:return "associate";
            case 3:return "full";
        }
        return null;
    }
    public static String getSalary(String str){
        double salary = 0.0;
        if (str.equals("assistant")) {
            salary = Math.random() * 30000 + 50000;
        } else if (str.equals("associate")) {
            salary = Math.random() * 50000 + 60000;
        } else if (str.equals("full")) {
            salary = Math.random() * 55000 + 75000;
        }
        return salary+"";
    }
}
