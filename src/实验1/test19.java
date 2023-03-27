import java.util.Scanner;

public class test19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int flag = 0 ;
        if(num%5 == 0&&num%6 == 0)
            System.out.printf("Is %d divisible by 5 and 6?true\n",num);
        else System.out.printf("Is %d divisible by 5 and 6?false\n",num);
        if(num%5==0||num%6==0)
            System.out.printf("Is %d divisible by 5 or 6?true\n",num);
        else System.out.printf("Is %d divisible by 5 or 6?false\n",num);
        if((num%5==0&&num%6!=0)||(num%5!=0&&num%6==0))
            System.out.printf("Is %d divisible by 5 or 6,but not both?true\n",num);
        else System.out.printf("Is %d divisible by 5 or 6,but not both?false\n",num);

    }
}
