import java.util.Scanner;

public class test25 {
    public static void main(String[] args) {
        String []words = {"write","why","love","you","world"};
        int randomNumber = (int)((words.length)*Math.random());
        guess(words[randomNumber]);
    }
    public static void guess(String words){
        int count = 0;
        while (count<=words.length())
        {
            System.out.printf("(Guess) Enter a letter in word ");
            for (int i = 0; i < words.length() - count; i++) {
                System.out.printf("*");
            }
            System.out.println(">");
            Scanner scanner = new Scanner(System.in);
            char ch = scanner.next().charAt(0);
            int index = judge(words,ch);
            if(index != -1) count++;
            for (int i = 0; i < words.length() ; i++) {
                if(i == index) {
                    System.out.printf("%c",words.charAt(i));
                    continue;
                }
                System.out.printf("*");
            }

        }
    }
    public static int judge(String words , char ch)
    {
        for (int i = 0; i < words.length(); i++) {
            if(ch == words.charAt(i))
                return i;
        }
        return -1;
    }
}
