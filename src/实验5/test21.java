import java.util.ArrayList;

public class test21 {
}

class MyString2{
    ArrayList list = new ArrayList();
    public MyString2(String s){
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
    }

    public int compare(String s){ //返回两字符串中相等的元素个数
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == (char) list.get(i)){
                count++;
            }
        }
        return count;
    }

    public MyString2 substring(int begin){
        String res = "";
        for (int i = begin; i < list.size(); i++) {
            res+=list.get(i);
        }
        return new MyString2(res);
    }

    public MyString2 toUpperCaseO(){
        for (int i = 0; i < list.size(); i++) {
            char temp = (char)list.get(i);
            if(temp>='a'&&temp<='z'){
               temp-=32;
               list.add(i,temp);
            }
        }
        return substring(0);
    }

    public char[] toChars(){
        char[] ch = new char[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ch[i] =(char) list.get(i);
        }
        return ch;
    }

    public static MyString2 valueOf(boolean b){
        return new MyString2(b?"1":"0");
    }
}