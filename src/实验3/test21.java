public class test21 {
    public static void main(String[] args) {
        boolean [] arr = new boolean[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = false;//初始化全为false
        }
        //第一个学生
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        }
        //第二个学生
        for (int i = 1; i < arr.length; i+=2) {
            arr[i] = false;
        }
        //从学生3开始循环改变状态
        for (int i = 3; i <= args.length; i++) {
            for (int j = i-1; j < arr.length; j++) {
                if(arr[j] ) {
                    arr[j] = false;
                }
                else arr[j] = true;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] ) System.out.printf("%d ",i+1);
        }
    }
}
