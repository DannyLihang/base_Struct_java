public class java02 {
    public static void main(String[] args) {
        Derive d = new Derive();
    }

    private int i;

    public java02(int i) {
        this.i = i;
    }

    public java02(){

    }
}
    class Derive extends java02{
        private int j;

        public Derive(){
            super();
        }
    }
