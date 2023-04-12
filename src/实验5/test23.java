public class test23 {
    public static void main(String[] args) {

    }
    public static String[] split(String s, String regex){
        int lens= s.length();
        int lenr = regex.length();
        int count = 1;
        for (int a = 0 ; a < lens ; a++){
            for (int b = 0 ; b < lenr ; b++){
                if (s.charAt(a) == regex.charAt(b)){
                    count += 2;
                }
            }
        }
        String[] res = new String[count];
        String temp = "";
        String tempr = "";
        int countr;
        for (int index = 0 ; index < count - 1 ;){
            for (int a = 0 ; a < lens ; a++){
                countr = 0;
                for (int b = 0 ; b < lenr ; b++){
                    if (s.charAt(a) != regex.charAt(b))
                        countr++;
                    else
                        tempr = regex.charAt(b) + "";
                }
                if (countr == lenr){
                    temp += s.charAt(a);
                } else {
                    res[index] = temp;
                    temp = "";
                    index++;
                    res[index] = tempr;
                    index++;
                }
                if (a == (lens - 1)){
                    res[index] = temp;
                }
            }
        }
        return res;
    }
}
