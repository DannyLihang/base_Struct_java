import java.util.ArrayList;

public class test20 {

}
class MyStringl{
    ArrayList list = new ArrayList();
    public MyStringl(char[] chars){
        for (int i = 0; i < chars.length; i++) {
            list.add(chars[i]);
        }
    }

    public char charAt(int index){
        return (char) list.get(index);
    }

    public int length(){
        return list.size();
    }

    public MyStringl substring(int begin, int end){
        char [] help = new char[end-begin];
        for (int i = begin; i < end; i++) {
            help[i-begin] = (char) list.get(i);
        }
        return new MyStringl(help);
    }

    public MyStringl toLowerCase(){
        char [] help = new char[list.size()];
        for (int i = 0; i < length(); i++) {
            help[i] = Character.toLowerCase((char) list.get(i));
        }
        return new MyStringl(help);
    }

    public boolean equals(MyStringl s){
        if(length() != s.length()) return false;
        for (int i = 0; i < length(); i++) {
            if(charAt(i) != (char) list.get(i))
                return false;
        }
        return true;
    }

    public static MyStringl valueOf(int i){
        return new MyStringl(String.valueOf(i).toCharArray());
    }
}
