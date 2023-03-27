public class test18 {
    public static void main(String[] args) {
        int num = (int)(Math.random()*4);//随机生成数，代表花色
        int n = 1+(int)(Math.random()*13);
        if(num == 0)//黑梅花
        {
            if(n>=2&&n<=10) System.out.printf("The card you picked is %d of Clubs",n);
            if(n == 1) System.out.println("The card you picked is Ace of Clubs");
            if(n == 11) System.out.println("The card you picked is Jack of Clubs");
            if(n == 12) System.out.println("The card you picked is Queen of Clubs");
            if(n == 13) System.out.println("The card you picked is King of Clubs");
        }
        else if(num == 1)//红方块
        {
            if(n>=2&&n<=10) System.out.printf("The card you picked is %d of Diamonds",n);
            if(n == 1) System.out.println("The card you picked is Ace of Diamonds");
            if(n == 11) System.out.println("The card you picked is Jack of Diamonds");
            if(n == 12) System.out.println("The card you picked is Queen of Diamonds");
            if(n == 13) System.out.println("The card you picked is King of Diamonds");
        }
        else if(num == 2)//红心
        {
            if(n>=2&&n<=10) System.out.printf("The card you picked is %d of Hearts",n);
            if(n == 1) System.out.println("The card you picked is Ace of Hearts");
            if(n == 11) System.out.println("The card you picked is Jack of Hearts");
            if(n == 12) System.out.println("The card you picked is Queen of Hearts");
            if(n == 13) System.out.println("The card you picked is King of Hearts");
        }
        else if(num == 3)
        {
            if(n>=2&&n<=10) System.out.printf("The card you picked is %d of Spades",n);
            if(n == 1) System.out.println("The card you picked is Ace of Spades");
            if(n == 11) System.out.println("The card you picked is Jack of Spades");
            if(n == 12) System.out.println("The card you picked is Queen of Spades");
            if(n == 13) System.out.println("The card you picked is King of Spades");
        }
    }
}
