import java.util.ArrayList;
import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five integers for list1:");
        ArrayList<Integer> integers1 = new ArrayList<>();
        ArrayList<Integer> integers2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            integers1.add(scanner.nextInt());
        }
        System.out.println("Enter five integers for list2:");
        for (int i = 0; i < 5; i++) {
            integers2.add(scanner.nextInt());
        }
        ArrayList<Integer> integers3 = new ArrayList<>();
        integers3 = union(integers1,integers2);
        System.out.println(integers3);
    }
    public static ArrayList<Integer> union(ArrayList<Integer> list1,ArrayList<Integer> list2){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            list.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            list.add(list2.get(i));
        }
        return list;
    }
}
