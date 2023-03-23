public class Stack {
    //for test
    public static void main(String[] args) {
        arraystack stack = new arraystack(4);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.list();
        System.out.println("=============");
        stack.pop();
        stack.list();
    }
}
//创建一个类，用数组模拟栈结构
class arraystack{
    private int maxsize;//栈的大小
    private int[]stack;//数组模拟栈，数据放在数组中
    private int top = -1;//初始化栈顶为-1
    //构造器
    public arraystack(int maxsize)
    {
        this.maxsize = maxsize;
        stack = new int[this.maxsize];//初始化数组
    }
    //判断栈满
    public boolean isfull()
    {
        return top == maxsize - 1;
    }
    //判断栈空
    public boolean isempty()
    {
        return top == -1;
    }
    //入栈
    public void push(int value)
    {
        if(isfull()) return;
        stack[++top] = value;
    }
    //出栈
    public int pop()
    {
        if(isempty()) throw new RuntimeException("栈空，没有数据");
        int value = stack[top--];
        return value;
    }
    //遍历栈
    public void list()
    {
        if(isempty()) return;
        for(int i = top ; i >= 0 ; i--)
        {
            System.out.printf("stack[%d] = %d\n",i,stack[i]);
        }
    }
}
