public class test24 {
    public static void main(String[] args) {
        int result = 0;
        switch (args[1].charAt(0)){
            case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);break;
            case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);break;
            case '*': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);break;
            case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);break;
        }
        System.out.println(args[0] + " " + args[1] + " " + args[2] + "=" + result);
    }
}
