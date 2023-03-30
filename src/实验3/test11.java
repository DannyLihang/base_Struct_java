public class test11 {
    public static void main(String[] args) {
        int a = (int)(Math.random()*6+1);
        int b = (int)(Math.random()*6+1);
        System.out.printf("You rolled %d + %d = %d\n",a,b,a+b);
        if (a+b == 2 ||a+b == 12|| a+b == 3)
        {
            System.out.println("You lose");
        }
        else if(a+b == 7 || a+b == 11){
            System.out.println("You win");
        }
        else {
            System.out.printf("point is %d\n",a+b);
            int c = 0;
            int d = 0;
            while ((c+d)!=7||(c+d) == (a+b))
            {
                c = (int)(Math.random()*6+1);
                d = (int)(Math.random()*6+1);
                if((c+d)==7){
                    System.out.printf("You rolled %d + %d = %d\n",c,d,c+d);
                    System.out.println("You lose");
                }
                else if((c+d) == (a+b)){
                    System.out.println("You win");
                }
            }
        }
    }
}
