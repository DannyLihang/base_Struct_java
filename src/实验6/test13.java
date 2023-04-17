import java.util.ArrayList;
import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ten integers:");
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(scanner.nextInt());
        }
        removeDuplicate(integers);
        System.out.println(integers);
    }
    public static void removeDuplicate(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < i; j++) {
                if(list.get(j) == list.get(i)){
                    list.remove(i);
                }
            }
        }
    }
}
