 class parent {
        static int y=10;
    }
    class child extends parent {
        static int y=60;
        static {
            y=90;
        }
    }
public class dokaexample {
    public static void main(String []args) {
        System.out.println("The value of y="+child.y);
    }
}