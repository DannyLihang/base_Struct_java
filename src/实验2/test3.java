import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a hex character:");
        String hex = scanner.next();
        String str = "" ;
        if(hex(str)) {
            switch (hex) {
                case "0":
                    str = "0000";
                    break;
                case "1":
                    str = "0001";
                    break;
                case "2":
                    str = "0010";
                    break;
                case "3":
                    str = "0011";
                    break;
                case "4":
                    str = "0100";
                    break;
                case "5":
                    str = "0101";
                    break;
                case "6":
                    str = "0110";
                    break;
                case "7":
                    str = "0111";
                    break;
                case "8":
                    str = "1000";
                    break;
                case "9":
                    str = "1001";
                    break;
                case "A":
                    str = "1010";
                    break;
                case "B":
                    str = "1011";
                    break;
                case "C":
                    str = "1100";
                    break;
                case "D":
                    str = "1101";
                    break;
                case "E":
                    str = "1110";
                    break;
                case "F":
                    str = "1111";
                    break;
            }
            System.out.printf("The binary value is %s",str);
        }
        else
            System.out.printf("%s is an invalid input",hex);
    }
    public static boolean hex(String str)
    {
        if(str=="1"||str =="2"||str =="3"||str =="4"||str =="5"||str =="6"||str =="7"||str =="8"||str =="9"||str =="A"||str =="B"||str =="C"||str =="D"||str =="E"||str =="F")
          return false;
        else return true;
    }

}
