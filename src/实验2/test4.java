import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an uppercase letter:");
        String str = scanner.next();
        char uppercase = str.charAt(0);
        int num = 0;
        if((uppercase>='a'&&uppercase<='c') || (uppercase>='A'&&uppercase<='C')) num = 2;
        else if((uppercase>='d'&&uppercase<='f') || (uppercase>='D'&&uppercase<='F')) num = 3;
        else if((uppercase>='G'&&uppercase<='I') || (uppercase>='g'&&uppercase<='i')) num = 4;
        else if((uppercase>='J'&&uppercase<='L') || (uppercase>='j'&&uppercase<='l')) num = 5;
        else if((uppercase>='m'&&uppercase<='o') || (uppercase>='M'&&uppercase<='O')) num = 6;
        else if((uppercase>='P'&&uppercase<='S') || (uppercase>='p'&&uppercase<='s')) num = 7;
        else if((uppercase>='t'&&uppercase<='v') || (uppercase>='T'&&uppercase<='V')) num = 8;
        else if((uppercase>='W'&&uppercase<='Z') || (uppercase>='w'&&uppercase<='z')) num = 9;
        else System.out.printf("%c is an invalid input\n",uppercase);
        System.out.printf("The corresponding number is %d",num);
    }
}
