public class test26 {
    public static void main(String[] args) {
        int[][] time = {{2,4,3,4,5,8,8,0},{7,3,4,3,3,4,4,0},{3,3,4,3,3,2,2,0},{9,3,4,7,3,4,1,0},{3,5,4,3,6,3,8,0},{3,4,4,6,3,4,4,0},{3,7,4,8,3,8,4,0},{6,3,5,9,2,7,9,0}};
        for (int i = 0; i < time.length; i++) {
            for (int j = 0; j < time[0].length; j++) {
                time[i][time[0].length-1] += time[i][j];
            }
        }
        for (int i = 0; i < time.length ; i++) {
            for (int j = 1; j < time.length  - i; j++) {
                if(time[j][time[0].length-1]>time[j - 1][time[0].length-1])
                {
                    int t = time[j][time[0].length-1];
                    time[j][time[0].length-1] = time[j - 1][time[0].length-1];
                    time[j - 1][time[0].length-1] = t;
                }
            }
        }
        for (int i = 0; i < time.length; i++) {
            System.out.println(time[i][time[0].length-1]);
        }
    }
}
