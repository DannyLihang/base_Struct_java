import java.util.ArrayList;
import java.util.Scanner;

public class test17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        System.out.println("Enter an integer m:");
        int m = scanner.nextInt();
        int i = 2;
        int temp = m;
        while (temp >= i) {
            if (temp % i == 0) {
                integers.add(i);
                temp /= i;
            }
            else
                i++;
        }
        int n =findN(integers);
        System.out.printf("The smallest number n for m*n to be a perfect square is %d \n",n);
        System.out.println("m * n is " + m*n);
    }
    public static int findN(ArrayList<Integer> list){
        int n = 1;
        int count = 1;
        for (int i = 1; i < list.size(); i++) {
            if (!list.get(i).equals(list.get(i - 1))) {
                if (count % 2 == 1)
                    n *= list.get(i - 1);
                count = 1;
            }
            else count++;
            if (i == list.size() - 1 && count % 2 == 1) {
                n *= list.get(i);
            }
        }
        return n;
    }

}
