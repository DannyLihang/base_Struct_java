public class test05 {
    /*
    编写一个程序，然后按降序显示小于 120 的所有素数。使用 StackOflntegers
类存储这些素数（例如：2、3、5、...)，获取之后按倒序显示它们。
     */
    public static void main(String[] args) {
        StackOflntegers stackOflntegers = new StackOflntegers(120);
        stackOflntegers.calculate();
        stackOflntegers.print();
    }
}
class StackOflntegers{
    public int num;
    int k = 0;
    public int[] arr = new int[100];
    public StackOflntegers(int num) {
        this.num = num;
    }

    public void calculate(){
        //int k = 0;
        for (int i = 2; i <= this.num ; i++) {
            if(isPrime(i)) arr[k++] = i;
        }
    }

    public boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) return false;
        }
        return true;
    }

    public void print(){
        for (int i = k-1; i >=0 ; i--) {
            System.out.printf("%d ",arr[i]);
        }
    }
}