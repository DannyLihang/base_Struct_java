import java.util.Scanner;

public class test31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] groups = new int[6][7];
        while (judge(groups)) {
            menu(groups);
            System.out.printf("Drop a red disk at column (0-6):");
            int colr = scanner.nextInt();
            change(groups, colr,'r');
            System.out.printf("Drop a yellow disk at column (0-6):");
            int colY = scanner.nextInt();
            change(groups,colY,'y');
        }
    }
    public static boolean judge(int[][] groups)
    {
        for (int i = 0; i < 6; i++) {
            int count1 = 0;//行
            int count2 = 0;//列
            for (int j = 0; j < 7; j++) {
                if(groups[i][j] == 1) count1++;
                else if(groups[j][i] == 1) count2++;
            }
            if(count1 == 4||count2 == 4) return false;
        }
        return true;
    }
    public static void menu ( int[][] groups) {
        System.out.println("----------------");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("|\t");
            }
            System.out.println();
            for (int j = 0; j < 7; j++) {
                System.out.print("----");
            }
            System.out.println();
        }
    }
    public static void change ( int[][] groups,int col ,char ch) {
        int row = 5;
        for (int i = 0; i < 6; i++) {
            int count = 0;
            for (int j = 0; j <7 ; j++) {
                if(groups[i][j] == 1) count++;
            }
            if(count == 7) {row--;break;}
        }
        groups[row][col] = 1;
        System.out.println("----------------");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if(groups[i][j] == 1 && ch == 'x') System.out.println("|X");
                else if(groups[i][j] == 1 && ch == 'y') System.out.println("|Y");
                System.out.print("|\t");
            }
            System.out.println();
            for (int j = 0; j < 7; j++) {
                System.out.print("----");
            }
            System.out.println();
        }
    }
}
