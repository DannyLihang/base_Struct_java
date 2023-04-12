public class test22 {

}
class MyCharacter{
    char ch;
    public MyCharacter(int i){
        ch = (char) i;
    }
    public  MyCharacter valueOf(char c) {
        return new MyCharacter(c);
    }

    public static String toString(char c) {
        return String.valueOf(c);
    }
}
