import java.util.Stack;

//1.attention:在定义辅助变量temp时候，可以直接全部用node temp = head;
//          或者在添加功能时候用node temp = head,在修改和删除的时候用 node temp = head.next;
//          但是绝对不能全部都用node temp = head.next;
//          在写删除和插入功能时，都是通过遍历找到前一个节点，然后再用temp.next来处理
//2.单链表的反转：
//     1)定义一个辅助变量，帮助遍历原来的链表
//     2)遍历原来的链表，每遍历一个节点，就将其取出，并放在新的链表的最前端
public class singlelinkedlist {
    //实现单链表的反转
    public static void reversenodelist(node head) {
        if (head.next == null || head.next.next == null) {
            return;
        }
        node reversehead = new node(0, "", "");
        node temp = head.next;
        node next = null;//指向当前temp的下一个
        while (temp != null) {
            next = temp.next;//指向当前节点的下一个
            temp.next = reversehead.next;//将当前节点的下一个指向新的链表的最前端
            reversehead.next = temp;//将当前节点连接到新的链表上
            temp = next;//当前节点后移
        }
        head.next = reversehead.next;
    }
    //for test to reverse linked list
    public static void reverse(node head)
    {
        if(head.next == null || head.next.next == null)
            return;
        node tem = head.next;
        node n = null;
        node revesehead = new node(0,"","");
        while (tem != null)
        {
            n = tem.next;
            tem.next = revesehead.next;
            revesehead.next= tem;
            tem = n;
        }
        head.next = revesehead.next;
    }
    //实现逆序打印单链表，并且保证链表的结构不变
    //思路：利用栈的特点，先进后出的原则实现

    public static void printlist(node head)
    {
        if(head.next == null)
            return;
        Stack<node> stack = new Stack<node>();//创建一个栈
        node temp = head.next;
        //将链表中所有节点压入栈
        while (temp != null)
        {
            stack.push(temp);//压栈
            temp = temp.next;
        }
        //打印栈中的各个节点，pop出栈
        while (stack.size()>0)
        {
            System.out.println(stack.pop());
        }
    }
    //for learning the use of stack
    public static void printbyreverse(node head)
    {
        if(head.next == null)
            return;
        //创建一个栈
        Stack<node> stack = new Stack<node>();
        //将链表中的数据压入栈中
        node current = head.next;
        while (current != null )
        {
            stack.push(current);
            current = current.next;
        }
        //利用栈先进后出的原则，打印栈中的各个元素
        while (stack.size() > 0)
        {
            System.out.println(stack.pop());
        }
    }
    public static void main(String[] args) {
        //for test
        //创建节点
        node n1 = new node(1, "李航", "Danny");
        node n2 = new node(2, "重庆", "cq");
        //创建链表
        single_linkedlist list = new single_linkedlist();
        //list.add(n1);
        //list.add(n2);
        list.addbyorder(n2);
        list.addbyorder(n1);
        //显示
        list.list();
        System.out.println("===============================");
        /*node n = new node(1,"中国","China");
        list.revise(n);
        list.list();
        System.out.println("===============================");
        list.delete(n2);
        list.list();
        System.out.println("===============================");
        list.list();*/
        //reversenodelist(list.gethead());
        //reverse(list.gethead());
        //list.list();
        //System.out.println("====================================");
        //printlist(list.gethead());
        //System.out.println("for test reverse print linked list");
        //printbyreverse(list.gethead());
        System.out.println("==============================================");
        reverse(list.gethead());
        list.list();
    }
}
        //定义链表，管理节点
        class single_linkedlist{
            //先初始化一个头节点，并且保存头节点不动，不存放任何数据

            public node gethead() {
                return head;
            }

            private node head = new node(0,"","");
            //添加节点到单向链表
            //找到当前链表的最后节点，将这个节点的next指向新的节点

            public void add(node node1){
                //因为要保持头节点不动，所以要创建一个辅助变量t
                node t = head;
                while (true)
                {
                    if(t.next == null) break;
                    t = t.next;//指向下一个节点
                }
                t.next = node1;//让最后一个节点的next指向新的节点node1
            }
            public void addbyorder(node node1)
            {
                node t = head;
                int flag = 1;
                while (true)
                {
                    if(t.next == null) break;
                    if(t.next.num > node1.num) break;
                    else if(t.next.num == node1.num)
                    {
                        System.out.println("编号已经存在,无法添加");
                        flag = 0;break;
                    }
                    t = t.next;
                }
                if(flag == 1)
                {
                    node1.next = t.next;
                    t.next = node1;

                }
            }
            //修改数据
            public void revise(node node1)
            {
                if(head.next == null)
                {
                    System.out.println("链表为空，无法修改");
                    return;
                }
                node t = head.next;//辅助变量
                int flag = 0;
                while (true)
                {
                    if(t == null)
                    {
                        //已到链表最后
                        break;
                    }
                    if(t.num == node1.num)
                    {
                        flag = 1;
                        break;
                    }
                    t = t.next;
                }
                if(flag == 1)
                {
                    t.name = node1.name;
                    t.nname = node1.nname;
                }
                else System.out.println("链表无此元素，无法修改");
            }
            //删除数据
            public void delete(node node1)
            {
                if(head.next == null)
                {
                    System.out.println("链表为空，无法删除");
                    return;
                }
                int flag = 0;
                node t = head.next;
                while (true)
                {
                    if(t.next == null)
                    {
                        System.out.println("链表中无此元素，无法删除");
                        break;
                    }
                    if(t.next.num == node1.num)
                    {
                        flag = 1; break;
                    }
                    t = t.next;
                }
                if(flag == 0 )
                {
                    System.out.println("删除失败");
                }
                else
                {
                    t.next = t.next.next;
                }
            }
            //显示链表
            public void list()
            {
                if(head.next == null)
                {
                    System.out.println("链表为空");
                    return;
                }
                node t = head;
                while (true)
                {
                    if(t == null)
                    {
                        break;
                    }
                    System.out.println(t);
                    //t后移
                    t = t.next;
                }
            }
        }
        //定义节点
        class node{
            public int num;
            public String name;
            public String nname;
            public node next;//下一个节点

            //构造器
            public node(int num , String name , String nname)
            {
                this.num = num;
                this.name = name;
                this.nname = nname;
            }
            public String toString()
            {
                return "node [num=" + num +",name=" + name + ",nname=" + nname+ "]";
            }
        }


