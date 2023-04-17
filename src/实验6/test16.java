import java.util.ArrayList;
import java.util.Scanner;

public class test16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        System.out.println("What is 5+9?");
        int answer = 0;
        while (answer != 14){
            answer = scanner.nextInt();
            integers.add(answer);
            System.out.println("Wrong answer.Try again.What is 5+9?");
            if(isDuplicate(integers)){
                System.out.println("You already enter "+answer);
            }
        }
        System.out.println("You got it!");
    }
    public static boolean isDuplicate(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < i; j++) {
                if(list.get(j) == list.get(i)){
                    return true;
                }
            }
        }
        return false;
    }
}

