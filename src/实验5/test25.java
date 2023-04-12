public class test25 {

}
/*
（实现 StringBuilder 类）在 Java 库中提供了 StringBuilder 类。给出你自己对下面方法的
实现（将新类命名为 MyStringBuilderl):
public MyStringBuilderl(String s);
public MyStringBuilderl append(MyStringBuilderl s);
public MyStringBuilderl append(int i);
public int length();
public char charAt(int index);
public MyStringBuilderl toLowerCase();
public MyStringBuilderl substring(int begin, int end);
public String toString();
 */
class MyStringBuilder1{
    char []ch;
    public MyStringBuilder1(String s){
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
    }

    public MyStringBuilder1 append(MyStringBuilder1 s){
        String r = this.toString();
        r+=s.toString();
        return new MyStringBuilder1(r);
    }

    public MyStringBuilder1 append(int i){
        String r = this.toString();
        r+=i;
        return new MyStringBuilder1(r);
    }

    public int length(){
        int count = 0;
        int i = 0;
        while (ch[i]!= '\0'){
            count++;
            i++;
        }
        return count;
    }

    public char charAt(int index){
        return ch[index];
    }

    public MyStringBuilder1 toLowerCase(){
        int i = 0;
        String res = "";
        while (ch[i]!= '\0'){
            char temp = ch[i];
            if(temp>='A' && temp<='Z'){
                ch[i]+=32;
                res+=ch[i];
            }
            i++;
        }
        return new MyStringBuilder1(res);
    }

    public MyStringBuilder1 substring(int begin, int end){
        String res = "";
        for (int i = begin; i < end; i++) {
            res+=ch[i];
        }
        return new MyStringBuilder1(res);
    }

    public String toString(){
        String res = "";
        for (int i =0; i < length(); i++) {
            res+=ch[i];
        }
        return res;
    }
}