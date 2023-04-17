import java.util.ArrayList;
import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入五个数字");
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextDouble());
        }
        System.out.println(sum(list));
    }

    public static double sum(ArrayList<Double> list) {
        double sum = 0.0;
        for (int i = 0; i < list.size(); i++) {
            sum+= list.get(i);
        }
        return sum;
    }
}
