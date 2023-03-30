public class test4 {
    public static void main(String[] args) {
        printChars('1','Z',10);
    }
    public static void printChars(char ch1, char ch2, int numberPerLine)
    {
        for( int i = 0 ; ch1 + i <= ch2 ; i++)
        {
            System.out.printf("%c ",ch1+i);
            if((i+1)%numberPerLine == 0)
                System.out.println();
        }
    }
}
