public class test08 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 1; i <= 20 ; i++) {
            queue.enqueue(i);
        }
        for (int i = 1; i <= 20; i++) {
            System.out.println(queue.dequeue()+" ");
        }
    }
}

class Queue{
    private int[] element;
    private int size;

    public Queue() {
        element = new int[8];

    }
    //方法 enqueue(int v)，用于将 v 加人到队列中。
    public void  enqueue(int v){
        element[size] = v;
        size++;
    }

    //方法 dequeue()，用于从队列中移除元素并返回该元素。
    public int dequeue(){
        int i = element[0];
        System.arraycopy(element,1,element,0,size);
        if(size == element.length){
            element[size--] = 0;
        }
        return i;
    }
    public int[] large(int []arr){
        int []help = new int[size*2];
        for (int i = 0; i < size; i++) {
            help[i] = arr[i];
        }
        arr = help;//传入地址
        return arr;
    }

    //方法 empty()，如果队列是空的话，该方法返回 true
    public boolean empty(){
        return size==0?true:false;
    }

    public int getSize() {
        return size;
    }
}