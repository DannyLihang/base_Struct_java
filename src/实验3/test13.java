public class test13 {
    public static void main(String[] args) {
        System.out.println(format(34,4));
    }
    public static String format(int number,int width)
    {
        String str = ""+number;
        String s = "";
        if(str.length()>width){
            return str;
        }
        else {
            for (int i = str.length(); i < width; i++) {
                s+="0";
            }
            return s+str;
        }
    }
}
