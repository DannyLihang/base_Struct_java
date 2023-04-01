public class t6 {
    public static void main(String[] args) {
        int []arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10);
        }

        StopWatch time = new StopWatch();
        time.start();
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex])
                {
                    swap(arr,j,minIndex);
                }
            }
        }
        time.stop();
        System.out.println(time.getElapsedTime());
    }
    public static void swap(int[]arr, int j , int i){
        int t = arr[j];
        arr[j] =arr[i];
        arr[i] = t;
    }
}
class StopWatch{
    private long startTime;
    private long endTime;
    public StopWatch(){
        startTime = System.currentTimeMillis();
    }
    public void start()
    {
        this.startTime =System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.endTime -this.startTime;
    }
}
