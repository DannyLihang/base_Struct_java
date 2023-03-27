import java.util.Scanner;

public class test16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer: scissor(0),rock(1),paper(2)");
        int num = scanner.nextInt();
        int con = (int)(Math.random()*3);
        switch (con)
        {
            case 0: {
                if (num == 0)
                    System.out.println("The computer is scissor.You are scissor too.It is a draw");
                else if(num == 1)
                    System.out.println("The computer is scissor.You are rock.You won");
                else System.out.println("The computer is scissor.You are paper.You loss");
                break;
            }
            case 1:{
                if (num == 0)
                    System.out.println("The computer is rock.You are scissor too.You loss");
                else if(num == 1)
                    System.out.println("The computer is rock.You are rock.It is a draw");
                else System.out.println("The computer is rock.You are paper.You won");
                break;
            }
            case 2:{
                if (num == 0)
                    System.out.println("The computer is paper.You are scissor too.You won");
                else if(num == 1)
                    System.out.println("The computer is paper.You are rock.You loss");
                else System.out.println("The computer is paper.You are paper.It is a draw");
                break;
            }
        }
    }
}
