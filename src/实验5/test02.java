public class test02 {
    /*
    （Mylnteger 类）设计一个名为 Mylnteger 的类。这个类包括：
 一个名为 value 的 int 型数据域，存储这个对象表示的 int 值。
 一个为指定的 int 值创建 MyInteger 对象的构造方法。
 一个返回 int 值的 get 方法。
 如果值分别为偶数、奇数或素数，那么 isEven()、isOdd()和 isPrime()方法都会返回 true。
 如果指定值分别为偶数、奇数或素数，那么相应的静态方法 isEven(int)、isOdd(int)和
isPrime(int)会返回 true。
 如果指定值分别为偶数、奇数或素数，那么相应的静态方法 isEven(Mylnteger)、
isOdd(Mylnteger)和 isPrime(Mylnteger)会返回 true。
 如果该对象的值与指定的值相等，那么 equals(int)和 equals(Mylnteger)方法返回 true。
 静态方法 parselnt(char[])将数字字符构成的数组转换为一个 int 值。
 静态方法 parselnt(String)将一个字符串转换为一个 int 值
     */
    public static void main(String[] args) {
        Mylnteger mylnteger = new Mylnteger(100);
        System.out.println(mylnteger.isEven());
        System.out.println(mylnteger.isOdd());
        System.out.println(mylnteger.isPrime());
    }
}
class Mylnteger{
    public int value;

    public Mylnteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven(){
        return this.value%2==0;
    }

    public boolean isOdd(){
        return this.value%2==1;
    }

    public boolean isPrime(){
        for (int i = 2; i <= Math.sqrt(this.value); i++) {
            if(this.value%i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(int value){
        return value%2==0;
    }

    public static boolean isOdd(int value){
        return value%2==1;
    }

    public static boolean isPrime(int value){
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if(value%i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(Mylnteger mylnteger){
        return mylnteger.value%2==0;
    }

    public static boolean isOdd(Mylnteger mylnteger){
        return mylnteger.value%2==1;
    }

    public static boolean isPrime(Mylnteger mylnteger){
        for (int i = 2; i <= Math.sqrt(mylnteger.value); i++) {
            if(mylnteger.value%i == 0) return false;
        }
        return true;
    }

    // 如果该对象的值与指定的值相等，那么 equals(int)和 equals(Mylnteger)方法返回 true。
    public boolean equals(int value)
    {
        return this.value == value;
    }

    public boolean equals(Mylnteger mylnteger)
    {
        return this.value == mylnteger.value;
    }

    public static int parselnt(char[] arr){
        int res = 0;
        int k = 1;
        for (int i = arr.length-1; i >=0; i--) {
            res += (arr[i]-48)*k;
            k*=10;
        }
        return res;
    }

    public static int parselnt(String str){
        return Integer.parseInt(str);
    }
}