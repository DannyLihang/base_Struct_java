import java.util.Scanner;

public class t13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the number of rows and columns in the array: ");
        double[][] a = new double[scanner.nextInt()][scanner.nextInt()];
        System.out.println("Enter the array:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = scanner.nextDouble();
            }
        }
        Location location1 = new Location(0,0,0);
        location1 = locateLargest(a);
        System.out.printf("The location of the largest element is %f at (%d,%d)",location1.maxValue
        ,location1.row,location1.column);
    }
    public static Location locateLargest(double[][] a){
        int row = 0,column = 0;
        double maxValue = a[row][column];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(a[i][j] > maxValue) {
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        Location location = new Location(row,column,maxValue);
        return location;
    }
}

class Location{
    public int row,column;
    public double maxValue;

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }
}