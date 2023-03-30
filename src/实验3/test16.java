import java.util.Scanner;

public class test16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double []array = new double[10];
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextDouble();
        }
        System.out.println(indexOfSmallestElement(array));
    }
    public static int indexOfSmallestElement(double []array)
    {
        double min = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i]<min)
            {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
