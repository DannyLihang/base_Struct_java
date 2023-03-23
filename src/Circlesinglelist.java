//下面进行了单向环形链表的操作以及使用，
//构建，遍历
//通过约瑟夫问题进行实操，包含功能有 删除，遍历
public class Circlesinglelist {
    public static void main(String[] args) {
        circle_single_list list = new circle_single_list();
        list.addboy(24);
        list.show();
        System.out.println("====================================");
        list.countboy(24,5,21);
    }
}
class circle_single_list{
    //创建第一个小孩
    private boy first = new boy(-1);
    //添加小孩
    public void addboy(int num)
    {
        if(num < 1)
            return;
        boy cur =first;
        for(int i = 1 ; i <= num ; i++)
        {
            boy node = new boy(i);
            if(i == 1 )
            {
                first = node ;
                first.next = first;
                cur = first;//让cur指向第一个小孩
            }
            else {
                cur.next = node;
                node.next = first;
                cur = cur.next;
            }
        }

    }
    public void show(){
        if(first == null)
            return;
        boy cur = first;
        while(true )
        {
            System.out.printf("当前的编号是：%d\n",cur.no);
            if(cur.next == first)
                break;
            cur = cur.next;
        }
    }
    public void countboy(int n , int k ,int m) // n为人数，k为 从第几个人开始报数，m为数几次
    {
        if(k<1||k>m||first == null)
            return;
        boy helper = first;//创建辅助节点
        while (true)
        {
            if(helper.next == first)
                break;
            helper = helper.next;
        }//移到最后位置
        //让first 和 helper 移动k - 1次
        for(int j = 0 ; j < k -1 ; j++)
        {
            first = first.next;
            helper = helper.next;
        }
        while (true)
        {
            if(first == helper)//说明链表中只有一个元素
                break;
            for(int j = 0 ; j < m -1 ; j++)
            {
                first = first.next;
                helper = helper.next;
            }
            System.out.printf("%d已经出圈 \n",first.no);
            first = first.next;
            helper.next = first;
        }
        System.out.printf("%d最后出圈\n",first.no);
    }
}
class boy{
    public int no;
    public boy next;
    //构造器
    public boy(int no)
    {
        this.no = no;
    }
}