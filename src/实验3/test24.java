import java.util.Scanner;

public class test24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list1:");
        int n1 = scanner.nextInt();
        int [] list1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            list1[i] = scanner.nextInt();
        }
        System.out.println("Enter list2:");
        int n2 = scanner.nextInt();
        int [] list2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            list2[i] = scanner.nextInt();
        }
        int[] help = new int[list1.length+ list2.length] ;
        help = merge(list1,list2);
        System.out.printf("The merged list is ");
        for (int i = 0; i < help.length; i++) {
            System.out.printf("%d ",help[i]);
        }
    }
    public static int[] merge(int []list1 , int []list2)
    {
        int[] help = new int[list1.length+ list2.length];
        int p1 = 0;
        int p2 = 0;
        int i = 0;
        while (p1 < list1.length && p2 < list2.length)
        {
            help[i++] = list1[p1] <= list2[p2] ? list1[p1++] : list2[p2++];
        }
        while (p1< list1.length)
        {
            help[i++] = list1[p1++];
        }
        while (p2< list2.length)
        {
            help[i++] = list2[p2++];
        }
        return help;
    }
}
