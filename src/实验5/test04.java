import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        /*
        . （显示素数因子）编写一个程序，提示用户输入一个正整数，然后以降序显示它的所有
最小因子。例如：如果整数为 120, 那么显示的最小因子为 5、3、2、2、2。使用
StackOfIntegers 类存储因子（例如：2、2、2、3、5), 获取之后按倒序显示这些因子。
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个正整数");
        StackOfIntegers stackOfIntegers = new StackOfIntegers(scanner.nextInt());
        stackOfIntegers.calculateDivisor();
        stackOfIntegers.printStack();
    }
}
class StackOfIntegers{
    public int num;
    public int[] arr = new int[100];
    public StackOfIntegers(int num) {
        this.num = num;
    }

    public void calculateDivisor(){
        int i = 0;
        int j =2;
        while (this.num !=0){

            if(this.num%j==0){
                arr[i++] = j;
                this.num/=j;
            }
            if(this.num%j !=0){
                j++;
            }
        }
    }

    public void printStack(){
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.printf("%d ",arr[i]);
        }
    }
}
