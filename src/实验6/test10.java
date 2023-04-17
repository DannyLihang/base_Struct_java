import java.util.Scanner;
public class test10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入5个字符串：");
        MyStack stack = new MyStack();
        //输入
        for (int i = 0; i < 5; i++)
            stack.push(input.next());
        //输出
        while (!stack.isEmpty())
            System.out.print(stack.pop() + " ");
    }
}
class MyStack extends java.util.ArrayList<Object> {
    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return size();
    }

    public Object peek() {
        return get(getSize() - 1);
    }

    public Object pop() {
        return remove(getSize() - 1);
    }

    public Object push(Object o) {
        add(o);
        return o;
    }

    public String toString() {
        return "stack: " + toString();
    }
}