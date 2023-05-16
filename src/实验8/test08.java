import java.util.ArrayList;
import java.util.List;

public class test08 {
    /**
     * （修改 MyStack 类）重写程序清单 11-10（参见教材 P375）中的 MyStack 类，执行 list 域
     * 的深度复制。
     */
}
class MyStack extends ArrayList {
    public boolean isEmpty() {
        return this.isEmpty();
    }

    public int getSize() {
        return this.size();
    }

    public Object peek() {
        return this.get(getSize() - 1);
    }

    public Object pop() {
        Object object = this.get(this.size() - 1);
        this.remove(this.size() - 1);
        return object;
    }

    public void push(Object object) {
        this.add(object);
    }

    @Override
    public String toString() {
        return "Stack: " + this.toString();
    }

    public List copy(){
        List arrayList = new ArrayList();
        arrayList.addAll(this);
        return arrayList;
    }
}