public class test26 {

}

class MyStringBuilder2{
    private String str ;
    public MyStringBuilder2(){
        this.str = null;
    }

    public MyStringBuilder2(char[] chars){
        for (int i = 0; i < chars.length; i++) {
            this.str += chars[i];
        }
    }

    public MyStringBuilder2(String s){
        this.str = s;
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s){
        String left = this.str.substring(0,offset);
        String right = this.str.substring(offset,this.str.length());
        return new MyStringBuilder2(left+s+right);
    }

    public MyStringBuilder2 reverse(){
        char [] ch = new char[this.str.length()];
        int j = this.str.length();
        for (int i = 0; i < this.str.length(); i++) {
            ch[i] = this.str.charAt(j-1);
            j--;
        }
        return new MyStringBuilder2(ch);
    }

    public MyStringBuilder2 substring(int begin){
        String res = "";
        for (int i = begin; i < this.str.length(); i++) {
            res+=this.str.charAt(i);
        }
        return new MyStringBuilder2(res);
    }

    public MyStringBuilder2 toUpperCase(){
        return new MyStringBuilder2(this.str.toUpperCase());
    }
}
