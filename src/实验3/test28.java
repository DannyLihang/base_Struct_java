import java.util.Scanner;

public class test28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] groups = new int[3][3];
        while (judge(groups)) {
            menu(groups);
            System.out.printf("Enter a row (0, 1, or 2) for player X:");
            int rowX = scanner.nextInt();
            System.out.printf("Enter a column (0, 1, or 2) for player X:");
            int colX = scanner.nextInt();
            change(groups, rowX, colX,'x');
            System.out.printf("Enter a row (0, 1, or 2) for player Y:");
            int rowY = scanner.nextInt();
            System.out.printf("Enter a column (0, 1, or 2) for player Y:");
            int colY = scanner.nextInt();
            change(groups, rowY, colY,'y');
        }
    }
    public static boolean judge(int[][] groups)
    {
        for (int i = 0; i < 3; i++) {
            int count1 = 0;//行
            int count2 = 0;//列
            for (int j = 0; j < 3; j++) {
                if(groups[i][j] == 1) count1++;
                else if(groups[j][i] == 1) count2++;
            }
            if(count1 == 3||count2 == 3) return false;
        }
        return true;
    }
    public static void menu ( int[][] groups) {
        System.out.println("----------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("|\t");
            }
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print("----");
            }
            System.out.println();
        }
    }
    public static void change ( int[][] groups, int row, int col ,char ch) {
        groups[row][col] = 1;
        System.out.println("----------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(groups[i][j] == 1 && ch == 'x') System.out.println("|X");
                else if(groups[i][j] == 1 && ch == 'y') System.out.println("|Y");
                System.out.print("|\t");
            }
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print("----");
            }
            System.out.println();
        }
    }
}
