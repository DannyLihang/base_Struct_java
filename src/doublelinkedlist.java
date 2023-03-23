public class doublelinkedlist {
    //for test
    public static void main(String[] args) {
        //创建节点
        nodee n1 = new nodee(1, "世界", "中国");
        nodee n2 = new nodee(2,"中国","重庆");
        nodee n3 = new nodee(3,"重庆","开州");
        nodee n4 = new nodee(5,"重庆","CQUT");
        //创建链表
        double_linkedlist linkedlist = new double_linkedlist();
        linkedlist.add(n1);
        linkedlist.add(n2);
        linkedlist.add(n3);
        linkedlist.add(n4);
        System.out.println("添加后");
        linkedlist.list();
        System.out.println("==================================");
        nodee n5 = new nodee(3,"重庆","渝北");
        linkedlist.revise(n5);
        System.out.println("修改后~~");
        linkedlist.list();
        System.out.println("==================================");
        linkedlist.delete(n3);
        linkedlist.list();
        System.out.println("==================================");
        nodee n6 = new nodee(3,"开州","文峰塔");
        linkedlist.addbyorder(n6);
        linkedlist.list();
    }

}
    //定义节点
    class nodee {
        public int num;
        public String name;
        public String nname;
        public nodee pre;//上一个节点
        public nodee next;//下一个节点

        //构造器
        public nodee(int num , String name , String nname)
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
    //定义双链表，用于管理节点
    class double_linkedlist{
        //先初始化一个头节点，并让其不动，且不放任何数据
        private nodee head = new nodee(0,"","");
        //用于得到头结点
        public nodee getHead(){
            return head;
        }
        //用于添加节点，找到链表的最后，再向后面添加节点
        public void add(nodee node1){
            //因为要保持头结点不动，所以要定义一个辅助节点
            nodee temp = head;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = node1;
            node1.pre = temp;
        }
        //用于按照顺序添加节点
        public void addbyorder(nodee node1)
        {
            //定义辅助节点
            nodee temp = head;
            while (temp.next.num < node1.num)
            {
                temp = temp.next;
            }
            temp.next.pre = node1;
            node1.next = temp.next;
            temp.next = node1;
            node1.pre = temp;
        }
        //用于修改节点
        public void revise(nodee node1)
        {
            if(head.next == null)
                return;
            //定义一个辅助节点
            nodee temp = head.next;
            int flag = 0;
            while (true)
            {
                if(temp == null)
                    break;
                if(temp.num == node1.num)
                {
                    flag = 1;break;
                }
                temp = temp.next;
            }
            //找到或者找不到
            if(1 == flag)
            {
                temp.name = node1.name;
                temp.nname = node1.nname;
            }
            else System.out.println("链表无此元素，无法修改");
        }
        //用于删除节点
        public void delete(nodee node1)
        {
            if(head.next == null)
                return;
            //定义辅助节点
            nodee temp = head.next;
            //因为是双向链表，所以可以实现自我删除，不用像单链表找到前一个节点
            while (temp.num != node1.num)
            {
                temp = temp.next;
            }
            if(temp.next != null)
            {
                temp.next.pre = temp.pre;
                temp.pre.next = temp.next;
            }
            else if(temp.next == null)
            {
                temp.pre.next = null;
                temp.pre = null;
            }
            else System.out.println("无此元素，无法删除");
        }
        //用于打印出当前链表情况
        public void list(){
            if(head.next == null)
                System.out.println("此链表为空");
            //定义辅助节点
            nodee temp = head;
            while (temp != null)
            {
                System.out.println(temp);
                temp = temp.next;
            }
        }

    }

