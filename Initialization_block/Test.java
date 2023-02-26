public class Test {
    private int x;
    {
        System.out.println("Initialization block: x= "+x);
        x=5;
    }
    public Test(){
        System.out.println("Constructor called: x= "+x);
    }

    public static void main(String []args){
        Test t1;
        Test t2;
    }
}