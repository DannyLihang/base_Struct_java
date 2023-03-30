import java.util.Random;
import java.util.Scanner;

public class test20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop:");
        int bnumber = in.nextInt();
        System.out.print("Enter the number of slots in the bean machine:");
        int snumber = in.nextInt();
        String[][] statue = new String[bnumber][snumber - 1];
        int[] position = new int[bnumber];

        statue = track(bnumber, snumber, position);
        int[] slots = resultOfSlots(snumber, position);
        printTrack(statue);
        print(bnumber, snumber, slots);
    }
    public static int[] resultOfSlots(int snumber, int[] position) {
        int[] s = new int[snumber];
        for (int i = 0; i < position.length; i++) {
            for (int j = 0; j < snumber; j++) {
                if (j == position[i]) {
                    s[j]++;break;
                }
            }
        }
        return s;
    }
    public static int isfun() {
        Random r = new Random();
        return r.nextInt(2);
    }
    public static String[][] track(int bnumber, int snumber, int[] position) {
        String[][] track = new String[bnumber][snumber - 1];

        for (int i = 0; i < bnumber; i++)
        {
            for (int j = 0; j < snumber - 1; j++)
            {
                if (isfun() == 0) {
                    track[i][j] = "L";
                } else {
                    track[i][j] = "R";
                    position[i]++;
                }
            }
        }
        return track;
    }
    public static void printTrack(String[][] track) {
        for (int i = 0; i < track.length; i++) {
            for (int j = 0; j < track[i].length; j++) {
                System.out.print(track[i][j]);
            }
            System.out.println();
        }
    }
    public static void print(int bnumber, int snumbers, int[] slots) {
        for (int i = bnumber; i > 0; i--) {
            for (int j = 0; j < snumbers; j++) {
                if (slots[j] < i)
                    System.out.print(" ");
                else
                    System.out.print("O");
            }
            System.out.println();
        }

    }

}
